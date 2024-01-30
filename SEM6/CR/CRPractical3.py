def setUpper(text):
    return text.upper()

def removeSpaces(text):
    newText = ""
    for i in text:
        if i == " ":
            continue
        else:
            newText = newText + i
    return newText

def partInTwo(data):
    List = []
    group = 0
    for i in range(2, len(data), 2):
        List.append(data[group:i])
        
        group = i
    List.append(data[group:])
    return List

def makeParts(plainText):
    k = len(plainText)
    
    if k % 2 == 0:
        for i in range(0, k, 2):
            if plainText[i] == plainText[i+1]:
                new_word = plainText[0:i+1] + str('X') + plainText[i+1:]
                new_word = makeParts(new_word)
                break
            else:
                new_word = plainText
    else:
        for i in range(0, k-1, 2):
            if plainText[i] == plainText[i+1]:
                new_word = plainText[0:i+1] + str('X') + plainText[i+1:]
                new_word = makeParts(new_word)
                break
            else:
                new_word = plainText + str('X')
    
    return new_word

def generateKeyTable(Key):
    matrix = []
    data = ['0','1','2','3','4','5','6','7','8','9','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    
    k1 = []
    dataNew = []
    
    for i in Key:
        if i not in k1:
            k1.append(setUpper(i))
            
    for i in k1:
        if i not in dataNew:
            dataNew.append(i)
    
    for i in data:
        if i not in dataNew:
            dataNew.append(i)
            
    while dataNew != []:
        matrix.append(dataNew[:6])
        dataNew = dataNew[6:]

    return matrix

def inSameCol(matrix, el1Row, el1Col, el2Row, el2Col, rule=1):
    char1 = ''
    char2 = ''
    
    if el1Row == 5:
        char1 = matrix[0][el1Col]
    else:
        char1 = matrix[el1Row + rule][el1Col]

    if el2Row == 5:
        char2 = matrix[0][el2Col]
    else:
        char2 = matrix[el2Row + rule][el2Col]
        
    return char1, char2

def inSameRow(matrix, el1Row, el1Col, el2Row, el2Col, rule=1):
    char1 = ''
    char2 = ''
    
    if el1Col == 5:
        char1 = matrix[el1Row][0]
    else:
        char1 = matrix[el1Row][el1Col+rule]

    if el2Col == 5:
        char2 = matrix[el2Row][0]
    else:
        char2 = matrix[el2Row][el2Col+rule]
        
    return char1, char2

def intersection(matrix, el1Row, el1Col, el2Row, el2Col):
    char1 = ''
    char2 = ''

    char1 = matrix[el1Row][el2Col]
    char2 = matrix[el2Row][el1Col]
    
    return char1, char2

def search(matrix, data):
    for i in range(6):
        for j in range(6):
            if(matrix[i][j] == data):
                return i, j

def encryptPlayFair(plainText, Matrix, Rule=1):
    cipherText = []
    
    for i in range(0, len(plainText)):
        c1 = 0
        c2 = 0
        
        el1_x, el1_y = search(Matrix, plainText[i][0])
        el2_x, el2_y = search(Matrix, plainText[i][1])
        
        if el1_x == el2_x:
            c1 ,c2 = inSameRow(Matrix, el1_x, el1_y, el2_x, el2_y, Rule)
        elif el1_y == el2_y:
            c1 ,c2 = inSameCol(Matrix, el1_x, el1_y, el2_x, el2_y, Rule)
        else:
            c1 ,c2 = intersection(Matrix, el1_x, el1_y, el2_x, el2_y)
        
        cipher = c1 + c2
        cipherText.append(cipher)
    
    return cipherText

PlainText = open("./Plain.txt").read()
Key = "PATEL96"
print("PlainText:", PlainText)
print("Key:", Key)
PlainText = removeSpaces(PlainText)
PlainText = setUpper(PlainText)
PlainText = makeParts(PlainText)
PlainText = partInTwo(PlainText)
print("Separated PlainText:" ,PlainText)
matrix = generateKeyTable(Key)

print("=====>KEY MATRIX<=====")

for i in range(6):
    print(matrix[i])
    
print("=====>KEY MATRIX<=====")

cipherList = encryptPlayFair(PlainText, matrix)
cipher = ""
for i in range(len(cipherList)):
    cipher = cipher + cipherList[i]
out = open("./Encipher.txt", 'w')
dataToWrite = "EncipheredData: " + cipher
out.write(dataToWrite)
print("CipherText:",cipher)

test = encryptPlayFair(cipherList, matrix, -1)
print("Decrypted Text:",test)
dataToWrite = "DecipheredData: " + "".join(test[i] for i in range(len(test)))

out = open("./Decipher.txt", 'w')
out.write(dataToWrite)

