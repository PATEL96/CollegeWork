import pandas as pd

# Creating a DataFrame
data = {'Name': ['Alice', 'Bob', 'Charlie'],
        'Age': [25, 30, 22]}
df = pd.DataFrame(data)

#printing values
print(df.head())

# Filtering data
filtered_df = df[df['Age'] > 23]

#printing values
print(filtered_df.head())

# Grouping and aggregation
grouped_df = df.groupby('Age').count()

# Reading CSV file
csv_data = pd.read_csv('Iris.csv')

#printing values
print(csv_data.head(10))