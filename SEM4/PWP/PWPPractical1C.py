Minimum = int(input("Enter Minimum Limit: "))
Maximum = int(input("Enter Maximum Limit: "))

for number in range (Minimum, Maximum + 1):  
    if number > 1:  
        for i in range (2, int(number/2)):  
            if (number % i) == 0:  
                break  
        else:
            print (number)