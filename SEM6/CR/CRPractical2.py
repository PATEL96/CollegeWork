def ecnryptRailFence(PlainText, Key):
    CT = ""
    matrix = [['-' for _ in range(len(PlainText))] for i in range(Key)]
    direction = -1
    row, col = 0,0

    for char in PlainText:
        matrix[row][col] = char
        col += 1

        if row == 0 or row == Key - 1:
            direction *= -1

        row += direction

    for i in range(Key):
        for j in matrix[i]:
            if j != '-':
                CT += j
    
    return CT, matrix

def decryptRailFence(CipherText, Key):
    PT = ""
    matrix = [['|' for _ in range(len(CipherText))] for _ in range(Key)]
    initMatrix = matrix.copy()

    direction = -1
    row, col = 0, 0

    for _ in range(len(CipherText)):
        matrix[row][col] = '*'
        col += 1

        if row == 0 or row == Key - 1:
            direction *= -1

        row += direction
        

    index = 0
    for i in range(Key):
        for j in range(len(CipherText)):
            if matrix[i][j] == '*' and index < len(CipherText):
                matrix[i][j] = CipherText[index]
                index += 1

    direction = -1
    row, col = 0, 0

    for _ in range(len(CipherText)):
        PT += matrix[row][col]
        col += 1

        if row == 0 or row == Key - 1:
            direction *= -1

        row += direction

    return PT

#? Reading Original File
PlainText = open("./Plain.txt").read()
print("OriginalData:", PlainText)
#? Reading Original File
Key = 3

#? Generating Cipher Text and placing it into Cipher.txt
Cipher = ecnryptRailFence(PlainText, Key)
CipherText = Cipher[0]
Matrix = Cipher[1]

print("=====>MATRIX<=====")

for i in range(Key):
    print(Matrix[i])

print("=====>MATRIX<=====")
print("CipherText:", CipherText)

out = open("./Encipher.txt",'w')
out.write(CipherText)
#? Generating Cipher Text and placing it into Cipher.txt

#? Deciphering Text and placing it into Decipher.txt
dec = open("./Decipher.txt", 'w')
DecipherText = decryptRailFence(CipherText, Key)
dec.write(DecipherText)
print("PlainText:", DecipherText)
#? Deciphering Text and placing it into Decipher.txt 