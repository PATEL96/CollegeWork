n = int(input("Enter no. of Terms reuired: "))

def Fibonaci(n):
	if n==0:
		return 0
	elif n==1:
		return 1
	else:
		return Fibonaci(n-1) + Fibonaci(n-2)	

series = [Fibonaci(i)for i in range(0,n)]

print(series)