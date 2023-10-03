import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df = pd.read_csv('./IRIS.csv')

correlation_matrix = df.corr()

plt.figure(figsize=(12, 10))
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', fmt='.2f', linewidths=0.5)
plt.title('Pearson Correlation Matrix')
plt.show()