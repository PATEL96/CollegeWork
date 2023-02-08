letter = input("Enter Any Character: ")[0]

vowels = "AEIOUaeiou"

for i in vowels:
    if(letter == i):
        print(letter, "is a Vowel.")
        break
else:
	print(letter, "is not Vowel.")