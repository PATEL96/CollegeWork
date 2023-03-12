import re

def Validate(Password):
	if len(Password) < 6:
		return False
	if len(Password) > 12:
		return False
	if not re.search("[a-z]", Password):
		return False
	if not re.search("[A-Z]", Password):
		return False
	if not re.search("[0-9]", Password):
		return False
	if not re.search("[_@$]", Password):
		return False
	return True

password = input("Enter Your Password:")

if Validate(password):
	print("Password is Valid.")
else:
	print("Password is Not Valid.")