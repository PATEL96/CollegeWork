Text = str(input("Enter anything: "))
b =''
for i in Text:
    b = i + b
if Text == b:
    print("It is Pallindrome")
else:
    print("It is Not Pallindrome")