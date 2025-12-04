class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] verticies = {
      "Liberal Arts", // 0
      "Student Services", // 1
      "Health Careers & Sciences",// 2
      "Health Technologies Center", // 3
      "Recreation Center", // 4
      "Technology Learning Center", // 5
      "Business & Technology", // 6
      "Theatre" // 7
    };
    // 2-Define Edges
    int[][] edges = {
      {0, 1}, {0, 6}, {0, 7},
      {1, 0}, {1, 2}, {1, 4}, {1, 5}, {1, 6},
      {2, 1}, {2, 3}, {2, 4},
      {3, 2},
      {4, 1}, {4, 2},
      {5, 1},
      {6, 0}, {6, 1}, {6, 7},
      {7, 0}, {7, 6}
    };
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(verticies, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    for (int v : dfs.getSearchOrder()) {
      System.out.print(v + " ");
    }
    System.out.println();
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\nParent-Child Relationships:");
    for (int i = 0; i < verticies.length; i++) {
      int parent = dfs.getParent(i);
      if (parent != -1) {
        System.out.println(graph.getVertex(parent) + " is the parent of " + graph.getVertex(i));
      } else {
        System.out.println(graph.getVertex(i) + " is the root");
      }
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    dfs.printPath(3);
    System.out.println();
    dfs.printPath(1);
    System.out.println();
    dfs.printPath(4);
    System.out.println();

     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nDFS Tree:");
    dfs.printTree();
    
  }
}