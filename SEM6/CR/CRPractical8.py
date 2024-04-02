from flask import Flask, jsonify, request
import hashlib
import json
from time import time

app = Flask(__name__)

class Block:
    def __init__(self, index, timestamp, transactions, previous_hash):
        self.index = index
        self.timestamp = timestamp
        self.transactions = transactions
        self.previous_hash = previous_hash
        self.nonce = 0

    def calculate_hash(self):
        block_string = json.dumps(self.__dict__, sort_keys=True)
        return hashlib.sha256(block_string.encode()).hexdigest()

class Blockchain:
    def __init__(self):
        self.chain = []
        self.current_transactions = []
        self.create_genesis_block()

    def create_genesis_block(self):
        self.add_block(previous_hash='1')

    def add_block(self, previous_hash):
        block = Block(len(self.chain) + 1, time(), self.current_transactions, previous_hash)
        block.hash = block.calculate_hash()
        self.chain.append(block)
        self.current_transactions = []
        return block

    def add_transaction(self, sender, recipient, amount):
        self.current_transactions.append({
            'sender': sender,
            'recipient': recipient,
            'amount': amount,
        })
        return self.get_latest_block().index + 1

    def get_latest_block(self):
        return self.chain[-1]

    def proof_of_work(self, block):
        while block.hash[:4] != "0000":
            block.nonce += 1
            block.hash = block.calculate_hash()
        return block.hash

blockchain = Blockchain()

@app.route('/transaction/new', methods=['POST'])
def new_transaction():
    values = request.get_json()
    required = ['sender', 'recipient', 'amount']
    if not all(k in values for k in required):
        return 'Missing values', 400

    index = blockchain.add_transaction(values['sender'], values['recipient'], values['amount'])

    response = {'message': f'Transaction will be added to Block {index}'}
    return jsonify(response), 201

@app.route('/mine', methods=['GET'])
def mine_block():
    previous_block = blockchain.get_latest_block()
    previous_hash = previous_block.calculate_hash()
    block = blockchain.add_block(previous_hash)

    response = {
        'message': 'Congratulations! You just mined a block!',
        'index': block.index,
        'timestamp': block.timestamp,
        'transactions': block.transactions,
        'previous_hash': block.previous_hash,
        'hash': block.hash
    }
    return jsonify(response), 200

@app.route('/chain', methods=['GET'])
def full_chain():
    chain_data = []
    for block in blockchain.chain:
        chain_data.append({
            'index': block.index,
            'timestamp': block.timestamp,
            'transactions': block.transactions,
            'previous_hash': block.previous_hash,
            'hash': block.hash
        })
    return jsonify(chain_data), 200

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
