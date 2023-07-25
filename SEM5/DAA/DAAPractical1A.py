import time
import sys

sys.setrecursionlimit(10**7)
sys.set_int_max_str_digits(10**7)

def Factorial(n):
    if n<=1:
        return 1
    return n*Factorial(n-1)

x = int(input("Enter Any Number:"))
st = time.time()
print(Factorial(x))
et = time.time()
print(et-st)