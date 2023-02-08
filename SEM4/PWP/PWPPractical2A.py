Dictionary = {'a':23,'b':17,'c':96}
Maximum = max(Dictionary, key = Dictionary.get)
Minimum = min(Dictionary, key = Dictionary.get)

print("Minimum: ", Dictionary[Minimum], " : ", Minimum)
print("Maximum: ", Dictionary[Maximum], " : ", Maximum)