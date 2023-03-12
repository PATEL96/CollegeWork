def ReadLast(File, n):
	with open(File, 'r') as F1:
		data = F1.readlines()
		for line in (data[-n:]):
			print(line, end='')

def ReadFirst(File, n):
	with open(File) as F2:
		data = F2.readlines()
		for line in (data[:n]):
			print(line, end='')


Fname = input("Enter File Name: ")
First = int(input("Enter No. of Starting Lines: "))
Last = int(input("Enter No. of Ending Lines: "))

print("First", First, "Lines.")
ReadFirst(Fname, First)

print("Last", Last, "Lines.")
ReadLast(Fname, Last)