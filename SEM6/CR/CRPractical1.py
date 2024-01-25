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
    
    
text = input("Enter Any String: ")
shift = int(input("Enter Number of Shifts: "))
encryptedVal = encrypt(text, shift)
decryptedVal = decrypt(encryptedVal, shift)


print("original Text:", text)
print("encrypted Text:", encryptedVal)
print("decrypted Text:", decryptedVal)