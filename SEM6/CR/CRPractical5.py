
#? pip3 install flask pycryptodome
from flask import Flask, render_template, request, redirect, url_for
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes
import base64


app = Flask(__name__)
app.template_folder = 'pages'

encryption_key = get_random_bytes(32)


def encrypt_password(password):
    cipher = AES.new(encryption_key, AES.MODE_GCM)
    encrypted_password, tag = cipher.encrypt_and_digest(password.encode('utf-8'))
    print(base64.b64encode(cipher.nonce + tag + encrypted_password).decode('utf-8'))
    return base64.b64encode(cipher.nonce + tag + encrypted_password).decode('utf-8')


def verify_password(encrypted_password, input_password):
    data = base64.b64decode(encrypted_password.encode('utf-8'))
    cipher = AES.new(encryption_key, AES.MODE_GCM, nonce=data[:16])
    decrypted_password = cipher.decrypt_and_verify(data[32:], data[16:32])
    return decrypted_password.decode('utf-8') == input_password

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/login', methods=['POST'])
def login():
    username = request.form['username']
    input_password = request.form['password']

    stored_encrypted_password = encrypt_password('rajvandan@12')


    if verify_password(stored_encrypted_password, input_password):
        return "Login successful " + username
    else:
        return "Invalid credentials"


if __name__ == '__main__':
    app.run(debug=True)
  