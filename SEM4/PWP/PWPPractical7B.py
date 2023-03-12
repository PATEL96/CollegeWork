import re

strr = input("Enter YOur HTML Sring: ")

print(re.compile(r'<[^>]+>').sub('', strr))