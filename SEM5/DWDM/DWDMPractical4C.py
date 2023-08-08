import matplotlib.pyplot as plt
import numpy as np

# Line plot
x = np.linspace(0, 10, 100)
y = np.sin(x)
plt.plot(x, y)
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.title('Sine Curve')
plt.show()

# Scatter plot
data = np.random.rand(50, 2)
plt.scatter(data[:, 0], data[:, 1])
plt.xlabel('Feature 1')
plt.ylabel('Feature 2')
plt.title('Scatter Plot')
plt.show()

# Bar plot
categories = ['Apples', 'Bananas', 'Cherries']
values = [25, 40, 15]
plt.bar(categories, values)
plt.xlabel('Fruits')
plt.ylabel('Quantity')
plt.title('Fruit Quantities')
plt.show()
