import time
#data = ['D', 'W', 'A', 'S', 'E', 'U', 'G']
data = []
n = int(input())
for i in reversed(range(n)):
    data.append(i)

def Sel(data):
    st = time.time()
    Arr = data.copy()
    for i in range(len(Arr)):
        minimum = i
        for j in range(i+1, len(Arr)):
            if Arr[j] > Arr[minimum]:
                minimum = j
                Arr[i], Arr[minimum] = Arr[minimum], Arr[i]
    
    et = time.time()
    return(et - st)

print(Sel(data))