import math

def gcd(a, h):
	temp = 0
	while(1):
		temp = a % h
		if (temp == 0):
			return h
		a = h
		h = temp

p = int(input("Enter value of P: "))
q = int(input("Enter value op Q: "))
n = p*q
e = int(input("Enter Value of E: "))
phi = (p-1)*(q-1)
d = int(input("Enter Value of D: "))
msg = int(input("Enter Message: "))

print()
print("P: ", p)
print("Q: ", q)
print("n: ", n)
print("e: ", e)
print("phi: ", phi)
print("d: ", d)

while (e < phi):
	if(gcd(e, phi) == 1):
		break
	else:
		e = e+1

print("Message data = ", msg)

c = pow(msg, e)
c = math.fmod(c, n)
print("Cipher Text = ", c)

m = pow(c, d)
m = math.fmod(m, n)
print("Plain Text = ", m)