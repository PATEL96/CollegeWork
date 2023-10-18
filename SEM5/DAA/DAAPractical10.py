def printPattern(a, p):
    n = len(a)
    m = len(p)
    for s in range(0, (n - m)):
        count = 0
        for i in range(m):
            if p[i] == a[s + i]:
                count += 1
        if count == m:
            return s
    
a = input('Text A: ')
p = input('Text B: ')
print("patterns occurs with shift", printPattern(a, p))