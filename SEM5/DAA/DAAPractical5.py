def fractional_knapsack_value(items, W):
    sorted_items = sorted(items, key=lambda x: x[1] / x[2], reverse=True)

    total_value = 0
    knapsack_weight = 0
    outmap = [0] * len(items)

    for item in sorted_items:
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


items = [
    ("Object 1", 60, 10),
    ("Object 2", 100, 20),
    ("Object 3", 170, 30),
    ("Object 4", 200, 40),
]
W = 70

max_value = fractional_knapsack_value(items, W)
print("Items That should be carried in the knapsack:")

for i in range(len(items)):
    print(items[i][0], "==>", max_value[1][i])
    
print("Maximum Profit is:", max_value[0])