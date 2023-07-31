import time
import sys

def Fibonacci(n):
    n1, n2 = 0, 1
    count = 0
    if n <= 0:
        print ("Enter Positive Integer...")
    elif n == 1:
        print ("Fibonacci of",n,"terms:", n1)
    else:
        print ("Fibonacci Series: ")
        while count < n-1:
            print(n1)
            nth = n1 + n2
            n1 = n2
            n2 = nth
            count += 1


x = int(input("Enter Limit: "))
st = time.time()
y = Fibonacci(x)
et = time.time()
print(et-st)