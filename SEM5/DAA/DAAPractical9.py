class Graph:
    def __init__(self):
        self.graph = {}

    def add_edge(self, u, v):
        self.graph.setdefault(u, []).append(v)

    def dfs(self, start, end):
        visited = set()
        stack = [(start, [start])]

        while stack:
            node, path = stack.pop()
            visited.add(node)

            if node == end:
                return path

            for neighbor in self.graph.get(node, []):
                if neighbor not in visited:
                    stack.append((neighbor, path + [neighbor]))

        return None

# Define the graph
graph = Graph()
graph.add_edge('a', 'b')
graph.add_edge('b', 'e')
graph.add_edge('e', 'e')
graph.add_edge('e', 'f')
graph.add_edge('f', 'd')
graph.add_edge('d', 'c')
graph.add_edge('c', 'b')
graph.add_edge('c', 'e')
graph.add_edge('b', 'd')
graph.add_edge('e', 'e')

# Source and destination nodes
start_node = 'a'
goal_node = 'f'

# Perform DFS and get the path
path = graph.dfs(start_node, goal_node)

# Print the path
if path:
    print("Path from {} to {}: {}".format(start_node, goal_node, ' -> '.join(path)))
else:
    print("No path found from {} to {}".format(start_node, goal_node))
