def TransposedMatrix(matrix):
	return[[row[i] for row in matrix] for i in range(len(matrix[0]))]
	
matrix = [[1,2,3],[4,5,6],[7,8,9]]
matrix2 = TransposedMatrix(matrix)

for row in matrix:
	print(row)

for row in matrix2:
	print(row)