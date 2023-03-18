import numpy as np
from scipy import linalg

arr1 = np.array([1,2,3,4]).reshape(2, 2)

print('First array:')
print(arr1)

print('\nSecond array:')
arr2 = np.array([12, 12])
print(arr2)

print('\nAdding the two arrays:')
print(np.add(arr1, arr2))

print('\nSubtracting the two arrays:')
print(np.subtract(arr1, arr2))

print('\nMultiplying the two arrays:')
print(np.multiply(arr1, arr2))

print('\nDividing the two arrays:')
print(np.divide(arr1, arr2))

print('\nApplying power function:')
print(np.power(arr1, 2))

a=linalg.det(arr1)
print('\nDeterminant of the array: ',a)

eigen_values, eigen_vectors = linalg.eig(arr1)
print('\nEigen values: ',eigen_values)
print('\nEigen vectors: ',eigen_vectors)