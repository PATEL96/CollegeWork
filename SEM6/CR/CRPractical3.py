def setUpper(text):
    return text.upper()

def generateKeyTable(word):
    list1 = ['0','1','2','3','4','5','6','7','8','9','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M','N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    key_letters = []
    for i in word:
        if i not in key_letters:
            key_letters.append(i)
 
    compElements = []
    for i in key_letters:
        if i not in compElements:
            compElements.append(i)
    for i in list1:
        if i not in compElements:
            compElements.append(i)
 
    matrix = []
    while compElements != []:
        matrix.append(compElements[:6])
        compElements = compElements[6:]
 
    return matrix


x = generateKeyTable(setUpper("rajpaTel2312"))

for i in range(6):
    print(x[i])