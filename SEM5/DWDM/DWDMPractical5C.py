# Impotant Always run this code on GOOGLE COLAB


# importing packages
import pandas as pd
import matplotlib.pyplot as plt

# create data
# df = pd.DataFrame([
#                    [180000, 110, 18.9, 1400],
#                    [360000, 905, 23.4, 1800],
#                    [230000, 230, 14.0, 1300],
#                    [60000, 450, 13.5, 1500],
#                    [600000, 250, 25.7, 2200],
#                    [550000, 895, 24, 1855]],

#                    columns=['Col A', 'Col B',
#                             'Col C', 'Col D'])
# view data
df = pd.read_csv('/content/drive/MyDrive/Colab Notebooks/Iris - Iris.csv')

display(df)
df.plot(kind = 'bar')

# copy the data
df_max_scaled = df.copy()


# apply normalization techniques
for column in df_max_scaled.columns:
    df_max_scaled[column] = df_max_scaled[column]  / df_max_scaled[column].abs().max()

# view normalized data
display(df_max_scaled)
df_max_scaled.plot(kind = 'bar')

# copy the data
df_z_scaled = df.copy()

# apply normalization techniques
for column in df_z_scaled.columns:
    df_z_scaled[column] = (df_z_scaled[column] - df_z_scaled[column].mean()) / df_z_scaled[column].std()

# view normalized data
display(df_z_scaled)

df_z_scaled.plot(kind = 'bar')