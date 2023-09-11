import time

# 1 2 3 4 5 6 7 8 9 10
# 89 42 100 93 11 234 30 82 22 75

st = time.time()

data = [
	(1,89),
	(2,42),
	(3,100),
	(4,93),
	(5,11),
	(6,234),
	(7,30),
	(8,82),
	(9,22),
	(10,75)
]

def get_Height(data):
    return data[1]

def BubbleSort(data):
    swapped = False
    
    for n in range(len(data)-1, 0, -1):
        for i in range(n):
            if get_Height(data[i]) > get_Height(data[i+1]):
                swapped = True
                data[i], data[i+1] = data[i+1], data[i]
        if not swapped:
            return
BubbleSort(data)
print(data)
et = time.time()
print(et-st)