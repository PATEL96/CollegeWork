def sackItems(items, W):
    total_value = 0
    knapsack_weight = 0
    outmap = [0] * len(items)
    
    for item in items:
        if knapsack_weight + item[2] <= W:
            total_value += item[1]
            outmap[items.index(item)] = 1
            knapsack_weight += item[2]
        else:
            remaining_capacity = W - knapsack_weight
            fraction = remaining_capacity / item[2]
            outmap[items.index(item)] = fraction
            total_value += fraction * item[1]
            
    return total_value,outmap

def knapsack_1(items, W):
    sorted_items = sorted(items, key=get_Val, reverse=True)
    return sackItems(sorted_items, W)

def knapsack_2(items, W):
    sorted_items = sorted(items, key=get_Weight)
    return sackItems(sorted_items, W)
    
def knapsack_3(items, W):
    sorted_items = sorted(items, key=lambda x: x[1] / x[2], reverse=True)
    return sackItems(sorted_items, W)

def get_Val(item):
    return item[1]

def get_Weight(item):
    return item[2]

items = [
    ("Object 1", 60, 10),
    ("Object 2", 170, 50),
    ("Object 3", 100, 30),
    ("Object 4", 200, 40),
]
W = 120


# Case 1
print("<----CASE 1---->")
max_value = knapsack_1(items, W)
print("Items that should be carried in the knapsack(Decreasing Value):")

for i in range(len(items)):
    print(items[i][0], "==>", max_value[1][i])
    
print("Maximum Profit is:", max_value[0])
print("<----CASE 1---->")
print()
# Case 1


# Case 2
print("<----CASE 2---->")
max_value = knapsack_2(items, W)
print("Items that should be carried in the knapsack(Increasing Weight):")

for i in range(len(items)):
    print(items[i][0], "==>", max_value[1][i])
    
print("Maximum Profit is:", max_value[0])
print("<----CASE 2---->")
print()
# Case 2


# Case 3
print("<----CASE 3---->")
max_value = knapsack_3(items, W)
print("Items that should be carried in the knapsack(Value by Weight):")

for i in range(len(items)):
    print(items[i][0], "==>", max_value[1][i])
    
print("Maximum Profit is:", max_value[0])
print("<----CASE 3---->")
print()
# Case 3