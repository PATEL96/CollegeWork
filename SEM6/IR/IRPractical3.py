#! Run below line in terminal before Running the Program(Only Once)
#? pip install matplotlib
import re
from collections import Counter
import matplotlib.pyplot as plt

def tokenize(text):
    words = re.findall(r'\b\w+\b', text.lower())
    return words

def zipf_distribution(text):
    words = tokenize(text)
    
    word_freq = Counter(words)

    sorted_word_freq = sorted(word_freq.items(), key=lambda x: x[1], reverse=True)
    
    ranks = range(1, len(sorted_word_freq) + 1)
    frequencies = [freq for word, freq in sorted_word_freq]
    
    plt.figure(figsize=(10, 6))
    plt.bar(ranks, frequencies)
    plt.xlabel('Word Rank')
    plt.ylabel('Frequency')
    plt.title('Zipf\'s Law Distribution')
    plt.xscale('log')
    plt.yscale('log')
    plt.show()

with open('Text.txt', 'r', encoding='utf-8') as file:
    text = file.read()

zipf_distribution(text)