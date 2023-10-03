import pandas as pd

df = pd.read_csv('./IRIS.csv')

print(df)
print(df.isnull().sum())

constant = 0.455
df_constant = df.fillna(constant)
print(df_constant)

col_mean = df.mean()
df_mean = df.fillna(col_mean)
print(df_mean)

def min_max_normalization(colomn):
  return(colomn - colomn.min()) / (colomn.max() - colomn.min())

def z_score_normalization(colomn):
  return(colomn - colomn.mean()) / colomn.std()

df2 = pd.read_csv('./IrisMain.csv')
print(df2['SepalLengthCm'])

minMax = min_max_normalization(df2['SepalLengthCm'])
zScore = z_score_normalization(df2['SepalLengthCm'])

print(minMax)
print(zScore)