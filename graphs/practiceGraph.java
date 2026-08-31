package graphs;

import java.util.*;

// I will use Adjacency Lists on Undirected Unweighted graphs
//Creation of Edge that is needed for a Graph
class Edge {

  int src, dest;

  Edge(int s, int d) {
    this.src = s;
    this.dest = d;
  }
}

public class practiceGraph {

  // Implementation of Adjacency List for creating a Graph
  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 1));
    graph[1].add(new Edge(1, 2));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[4].add(new Edge(4, 5));
    graph[5].add(new Edge(5, 6));
    graph[6].add(new Edge(6, 4));
  }

  // Implementation of BFS for Traversing through the graph Time Complexity O(V+E)
  public static void bfs(
    ArrayList<Edge>[] graph,
    int V,
    boolean[] vis,
    int startingPoint
  ) {
    // For FIFO implementation of traversing elements
    Queue<Integer> q = new LinkedList<>();
    // Inserting the starting Point of the graph into the queue
    q.add(startingPoint);
    while (!q.isEmpty()) {
      int curr = q.remove();
      if (vis[curr] == false) {
        // 1. To show proof of traversing, Print the element in the console
        System.out.print(curr + "  ");
        // 2. Make the tracking array of the current element to true
        vis[curr] = true;
        // 3. Add the neighbors into the queue
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
    }
    return;
  }

  //    Implementation of DFS (Depth First Search) --- it is similar to the recursion algorithms preOrder, inOrder, postOrder tree
  // traversals
  // This algorithm in Graph requires graph, boolean array of visited for tracking and another boolean array for manually
  //  updation of traversing nodes status
  public static void DFS(ArrayList<Edge>[] graph, boolean[] visited, int curr) {
    // This is only for DFS traversal
    if (visited[curr] == true) return; // BASE CONDITION for the recursion function

    System.out.print(curr + "   ");
    visited[curr] = true;

    // for loop for traversing through the Graph
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      DFS(graph, visited, e.dest);
    }
  }

  // Printing all the paths from source to destination in a graph
  // Here, to solve this, the approach we follow is DFS but one  more parameter is added
  public static void allPaths(
    ArrayList<Edge>[] graph,
    boolean[] visited,
    // boolean[] recursion,
    int src,
    int dest,
    String path
  ) {
    if (src == dest) {
      // BASE CONDITION FOR RECURSION
      System.out.println(path);
      return;
    }

    for (int i = 0; i < graph[src].size(); i++) {
      Edge e = graph[src].get(i);
      if (!visited[e.dest]) {
        visited[e.dest] = true;
        allPaths(graph, visited, e.dest, dest, path + e.dest);
        visited[e.dest] = false;
      }
    }
  }

  public static void main(String[] args) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];

    createGraph(graph);
    // A visualisation to print all the elements present in the graph
    // for (int i = 0; i < graph.length; i++) {
    //   for (int j = 0; j < graph[i].size(); j++) {
    //     Edge e = graph[i].get(j);
    //     System.out.println(e.src + " --> " + e.dest);
    //   }
    // }

    // Implementing the working of BFS even in the case of Disconnected Graphs
    boolean[] vis = new boolean[V];

    for (int i = 0; i < graph.length; i++) {
      if (vis[i] == false) {
        int startingPoint = i;
        bfs(graph, V, vis, startingPoint);
      }
    }

    // Implementing the working of DFS even in the case of Disconnected Graphs
    for (int i = 0; i < V; i++) {
      if (vis[i] == false) {
        DFS(graph, vis, i);
      }
    }

    allPaths(graph, vis, 0, 3, "" + 0);
  }
}
