with open ('Test.txt') as F1:
	data = F1.read().split()
	LenList = list()
	for i in range(len(data)):
		LenList.append(len(data[i]))
		
	for i in range(len(data)):
		if(len(data[i]) == max(LenList)):
			print("Longest Word: ", data[i])