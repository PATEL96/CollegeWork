def makeChange(coins, total):
	table = [[]] * len(coins)
	
	for i in range(len(coins)):
		table[i] = [0] * (total + 1)
		
	for i in range(len(coins)):
		for j in range(total+1):
			if( i == 0 and j < coins[i]):
				table[i][j] = 0
			elif(i == 0):
				table[i][j] = 1+table[0][j-coins[0]]
			elif(j < coins[i]):
				table[i][j] = table[i-1][j]
			else:
				table[i][j] = min(table[i-1][j], 1+table[i][j-coins[i]])
	
	return i, j, table, table[i][j]

def backTrack(coins, _i, _j, table):
	solution = []
	
	i = _i
	j = _j
	
	while(j > 0):
		if(table[i][j] == table[i-1][j]):
			i = i-1
		else:
			j = j - coins[i]
			solution.append(coins[i])
	
	for i in range(len(table)):
		print(table[i])
		
	return solution

coins = [1,4,6]
total = 8

main = makeChange(coins, total)
i = main[0]
j = main[1]
table = main[2]
val = main[3]

print(backTrack(coins,i,j,table))