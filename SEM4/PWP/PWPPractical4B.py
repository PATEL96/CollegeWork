a = input()
b = []
b = a.split(' ')
List = [a.count(i) for i in b]
D = dict(zip(b, List))
print(D)