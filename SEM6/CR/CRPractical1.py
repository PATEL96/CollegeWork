def encrypt(text, shift):
    CT = ""
    
    for char in text:
        CT = CT + chr((ord(char) - ord('A' if char.isupper() else 'a') + shift) % 26 + ord('A' if char.isupper() else 'a'))
    return CT

def decrypt(text, shift):
    CT = ""
    
    for char in text:
        CT = CT + chr((ord(char) - ord('A' if char.isupper() else 'a') - shift) % 26 + ord('A' if char.isupper() else 'a'))
    return CT

def bruteForce(text):
    CTList = []
    
    for i in range(26):
        CT = ""
        for char in text:
            CT = CT + chr((ord(char) - ord('A' if char.isupper() else 'a') - i) % 26 + ord('A' if char.isupper() else 'a'))
        CTList.append(CT)
    return CTList
            
    
text = open("./Plain.txt").read()
shift = int(input("Enter Number of Shifts: "))
encryptedVal = encrypt(text, shift)
decryptedVal = decrypt(encryptedVal, shift)


print("original Text:", text)
print("encrypted Text:", encryptedVal)
print("decrypted Text:", decryptedVal)

out = open("./Cipher.txt", 'w')
data = bruteForce(encryptedVal)

for i in data:
    out.writelines(i+"\n")