from collections import defaultdict

class Graph:
    
    def __init__(self, vertices):
        self.graph = defaultdict(list)
        self.V = vertices
    
    def addEdge(self, u, v):
        self.graph[u].append(v)
    
    def topologicalSortUtil(self, v, visited, stack):
        visited[v] = True
        
        for i in self.graph[v]:
            if visited[i] == False:
                self.topologicalSortUtil(i, visited, stack)
        
        stack.insert(0, v)
    
    def toptlogicalSort(self):
        
        visited = [False] * self.V
        stack = []
        
        for i in range(self.V):
            if visited[i] == False:
                self.topologicalSortUtil(i, visited, stack)
        
        print(stack)

'''
0 => A = Prepare Ingredients
1 => B = Heat Griddle
2 => C = Mix Ingredients
3 => D = Pour Onto Griddle
4 => E = Turn When Starts to Bubble
5 => F = Cook Until Golden Brown
6 => G = Eat
7 => H = Heat Syrup
'''

g= Graph(8)
g.addEdge(0, 2)
g.addEdge(2, 3)
g.addEdge(3, 4)
g.addEdge(4, 5)
g.addEdge(5, 6)
g.addEdge(7, 6)
g.addEdge(1, 3)

print("The Sequence Should be: ")
g.toptlogicalSort()