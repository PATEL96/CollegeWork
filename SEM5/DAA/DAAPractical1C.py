import time

def GCD(x, y):
    if(y==0):
        return x
    
    a = x
    b = y
    c = a%b
    return GCD(b,c)

num1 = int(input("Enter First Number:"))
num2 = int(input("Enter Second Number:"))

st = time.time()
print(GCD(num1, num2))
et = time.time()

print(et - st)