def First(Process, Storage):
    n = len(Storage)
    first = 0
    for i in range(n):
        if Storage[i] > Process:
            first = Storage[i]
            break
        
    return first

def Best(Process, Storage):
    n = len(Storage)
    best = []
    for i in range(n):
        if Storage[i] >= Process:
            best.append(Storage[i])
    
    return min(best)


def Worst(Process, Storage):
    n = len(Storage)
    worst = []
    for i in range(n):
        if Storage[i] >= Process:
            worst.append(Storage[i])
    return max(worst)
    
	
List = [100,23,3,41,55]

print("First Fit:",First(12, List))
print("Best Fit:",Best(12, List))
print("Worst Fit:",Worst(12, List))