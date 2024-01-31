def removeRepeat(Text):
    newText = ""
    
    for i in Text:
        if i not in newText:
            newText = newText + i

    return newText

def generateKeys():
    key = [
        	['A', 'X'], ['B', 'Q'], 
        	['C', 'W'], ['D', 'E'], 
           	['E', 'R'], ['F', 'T'], 
           	['G', 'Y'], ['H', 'U'], 
           	['I', 'P'], ['J', 'I'], 
           	['K', 'O'], ['L', 'A'], 
           	['M', 'S'], ['N', 'D'], 
           	['O', 'F'], ['P', 'G'], 
           	['Q', 'H'], ['R', 'J'], 
           	['S', 'K'], ['T', 'L'], 
           	['U', 'Z'], ['V', 'C'], 
           	['W', 'V'], ['X', 'B'], 
           	['Y', 'N'], ['Z', 'M']
        	]

    return key

def Encrypt(PT, Keys):
    CT = ""
    
    for i in PT:
        for j in range(len(Keys)):
            if i == Keys[j][0]:
                CT += Keys[j][1]
    
    return CT

def Decrypt(CT, Keys):
    PT = ""
    
    for i in CT:
        for j in range(len(Keys)):
            if i == Keys[j][1]:
                PT += Keys[j][0]
    
    return PT
    
PT = open("./Plain.txt").read()
print("Original Text:", PT)
PT = removeRepeat(PT)
print("Converted Text:", PT)
Keys = generateKeys()

encipheredData = Encrypt(PT, Keys)
encipheredFile = open("./Encipher.txt", 'w')
encipheredFile.write("Encypted Data: " + encipheredData)
print("Cipher Text:", encipheredData)

decipheredData = Decrypt(encipheredData, Keys)
decipheredFile = open("./Decipher.txt", 'w')
decipheredFile.write("Decryptes Data: " + decipheredData)
print("Plain Text:", decipheredData)