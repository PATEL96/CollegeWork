#! Run below line in terminal before Running the Program(Only Once)
#? pip install nltk
import nltk
nltk.download('punkt')
nltk.download('stopwords')
from nltk.tokenize import word_tokenize
from nltk.stem import PorterStemmer
from nltk.corpus import stopwords
import string

def tokenize_and_stem(file_path):
    with open(file_path, 'r') as file:
        document = file.read()

    tokens = word_tokenize(document)

    tokens = [token for token in tokens if token not in string.punctuation]

    stop_words = set(stopwords.words('english'))
    tokens = [token for token in tokens if token.lower() not in stop_words]

    stemmer = PorterStemmer()
    stemmed_tokens = [stemmer.stem(token) for token in tokens]

    return stemmed_tokens

file_path = 'Text.txt'
stemmed_tokens = tokenize_and_stem(file_path)
x = open('Output.txt', 'w')
for i in stemmed_tokens:
    x.write(i + "\n")
print("Stemmed tokens:", stemmed_tokens)