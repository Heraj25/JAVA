package graphs;

//implementation of graph
import java.util.*;

public class adjacencyList {

    private LinkedList<Integer> adj[];

    public adjacencyList(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }

    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    // IMPLEMENTING BFS ALGO BREADTH-FIRST-SEARCH

    public int bfs(int source, int destination) { // this method finds the minimum distance between source and
                                                  // destination

        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == destination)
                break;

            // the neighbour element of the current node
            for (int neighbour : adj[cur]) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.add(neighbour);
                    parent[neighbour] = cur;
                }
            }
        }

        int cur = destination;
        int distance = 0;

        // to print the path of the destination to source
        while (parent[cur] != -1) {
            System.out.println(cur + " ->");
            cur = parent[cur];
            distance++;
        }

        return distance;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of edges and vertices of the graph: ");

        int v = sc.nextInt();
        int e = sc.nextInt();

        adjacencyList graph = new adjacencyList(v);
        System.out.println("Enter " + e + " edges: ");
        for (int i = 0; i < e; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();

            graph.addEdge(source, destination);
        }

        sc.close();
    }

}
