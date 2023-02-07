a = [{'sem':6,'sub':'python'}, {'sem':6,'sub':'cns'}, {'sem':5,'sub':'java'}, {'sem':5,'sub':'daa'}]
n = int(input("Enter semester: "))


# Using For Loop
out = []
for i in range(len(a)):
    if a[i]['sem'] == n:
        out.append(a[i]['sub'])
# Using For Loop

# Using Filter, Map, Lambda Functions
test = list(map(lambda i: i['sub'], filter(lambda i: i['sem'] == n, a)))

print(out)
print(test)