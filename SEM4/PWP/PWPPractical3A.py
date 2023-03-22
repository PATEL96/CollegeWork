n = int(input("Enter no. of Terms required: "))

def Fibonacci(n):
	if n==0:
		return 0
	elif n==1:
		return 1
	else:
		return Fibonacci(n-1) + Fibonacci(n-2)

series = [ Fibonacci(i) for i in range(0,n) ]

print(series)