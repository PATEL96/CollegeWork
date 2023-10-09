import time

def quick_sort(arr):
	if len(arr) <=1:
		return arr
	
	pivot = arr[len(arr) // 2]
	left = [x for x in arr if x < pivot]
	middle = [x for x in arr if x == pivot]
	right = [x for x in arr if x > pivot]
	
	
	return quick_sort(left) + middle + quick_sort(right)
	

data = []


print("1 ==> Average Case")
print("2 ==> Worst Case")
opt = int(input('select Option:'))

if(opt == 1):
    st = time.time()
    for i in range(100000):
        data.append(i)
    et = time.time()
elif(opt == 2):
    st = time.time()
    for i in reversed(range(100000)):
        data.append(i)
    
    et = time.time()

quick_sort(data)
print(et-st)