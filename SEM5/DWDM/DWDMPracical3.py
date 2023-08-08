import numpy as np
import math
test = [10,44,22,45,22,33,20.554,95,62,21]

def Mode(List):
	vals,count = np.unique(List, return_counts = True)
	index = np.argmax(count)
	return(vals[index])

Mean = np.mean(test)

Median = np.median(test)

Variance = np.var(test)

Standard_Deviation = math.sqrt(Variance)

print("Data:",test)

print("Mean:",Mean)

print("Median:", Median)

print("Mode:", Mode(test))

print("Variance:", Variance)

print("Standard Deviation:", Standard_Deviation)