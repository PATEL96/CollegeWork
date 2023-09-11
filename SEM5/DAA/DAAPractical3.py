import time
# data = ['D', 'W', 'A', 'S', 'E', 'U', 'G']

data = []
n = int(input())
for i in reversed(range(n)):
    data.append(i)

def Sel(data):
    st = time.time()
    n = len(data)
      
    if n <= 1:
        return

    for i in range(1, n):
        key = data[i]
        j = i-1
        while j >= 0 and key < data[j]:
            data[j+1] = data[j]
            j -= 1
        data[j+1] = key
    
    et = time.time()
    return(et - st)

print(Sel(data))