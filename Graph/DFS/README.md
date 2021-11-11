```java
class Solution {
  public static void main(String[] args) {
  HashMap<Integer, List<Integer>> hashmap = new HashMap<Integer, List<Integer>>();
  hashmap.put(5, new ArrayList<>(Arrays.asList(2, 4)));
  hashmap.put(4, new ArrayList<>());
  hashmap.put(3, new ArrayList<>());
  hashmap.put(2, new ArrayList<>(Arrays.asList(1)));
  hashmap.put(1, new ArrayList<>(Arrays.asList(0, 3)));
  hashmap.put(0, new ArrayList<>(Arrays.asList(1)));
  
  int node = 5;
  List<Integer> visited = new ArrayList<>();
  dfs(hashmap, node, visited);
  
  }

  public static void dfs(HashMap<Integer, List<Integer>> hashmap, Integer node, List<Integer> visited) {
    System.out.println("Currently visiting node "+node);
    
    if (hashmap.get(node).isEmpty()) {
      return;
    }
    
    // Mark current node as visited
    visited.add(node);
    
    // visit all the unvisited neighbours of the current node.
    for (Integer neighbor : hashmap.get(node)) {
      if (!visited.contains(neighbor)) {
        // visit it
        dfs(hashmap, neighbor, visited);
      }
    }
  }
```
