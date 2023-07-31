import time

# 1 2 3 4 5 6 7 8 9 10
# 89 42 100 93 11 234 30 82 22 75

st = time.time()

data = [
	(1,89),
	(2,42),
	(3,100),
	(4,93),
	(5,11),
	(6,234),
	(7,30),
	(8,82),
	(9,22),
	(10,75)
]

def get_Height(data):
    return data[1]

sorted_list = sorted(data, key=get_Height)
print(sorted_list)
et = time.time()
print(et-st)