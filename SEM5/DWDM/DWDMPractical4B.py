import numpy as np

# Creating arrays
arr1 = np.array([1, 2, 3, 4, 5])
arr2 = np.array([[1, 2, 3], [4, 5, 6]])

# Basic arithmetic operations
sum_arr = arr1 + arr1
print(sum_arr)
product_arr = arr1 * 2
print(product_arr)

# Statistical operations
mean_value = np.mean(arr1)
print(mean_value)
max_value = np.max(arr2)
print(max_value)

# Broadcasting corrected
broadcasted_arr = arr1[:, np.newaxis] + arr1

print(broadcasted_arr)