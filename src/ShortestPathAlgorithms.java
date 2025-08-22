// Develop a program to find the shortest path between vertices using the Bellman-Ford
//and path vector routing algorithm.
import java.util.Scanner;
public class ShortestPathAlgorithms {
    // Bellman-Ford Algorithm to find the shortest path from a source vertex
    public static void bellmanFord(int[][] graph, int nodesCount, int source) {
        int[] dist = new int[nodesCount]; // Distance array
        for (int i = 0; i < nodesCount; i++) {
            dist[i] = Integer.MAX_VALUE; // Initialize distances as infinity
        }
        dist[source] = 0;
// Relax edges (nodesCount - 1) times
        for (int i = 1; i < nodesCount; i++) {
            for (int u = 0; u < nodesCount; u++) {
                for (int v = 0; v < nodesCount; v++) {
                    if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] <
                            dist[v]) {
                        dist[v] = dist[u] + graph[u][v]; // Relax the edge (u, v)
                    }
                }
            }
        }
// Check for negative weight cycles
        for (int u = 0; u < nodesCount; u++) {
            for (int v = 0; v < nodesCount; v++) {
                if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] <
                        dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }
// Output the results
        System.out.println("\nBellman-Ford Algorithm (Shortest Paths from Source " + source +
                "):");
        for (int i = 0; i < nodesCount; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Node " + i + ": INF");
            } else {
                System.out.println("Node " + i + ": " + dist[i]);
            }
        }
    }
    // Path Vector Routing Algorithm
    public static void pathVectorRouting(int[][] graph, int nodesCount) {
        int[][] routingTable = new int[nodesCount][nodesCount];
// Initialize routing tables with direct distances
        for (int i = 0; i < nodesCount; i++) {
            for (int j = 0; j < nodesCount; j++) {
                if (i == j) {
                    routingTable[i][j] = 0; // Distance to itself is 0
                } else if (graph[i][j] != 0) {
                    routingTable[i][j] = graph[i][j]; // Direct edge weight
                } else {
                    routingTable[i][j] = Integer.MAX_VALUE; // No direct edge
                }
            }
        }
// Propagate the routing table information (like distance vector)
        boolean updated;
        do {
            updated = false;
            for (int i = 0; i < nodesCount; i++) {
                for (int j = 0; j < nodesCount; j++) {
                    if (i != j) {
// Check if a better route can be found through an intermediate node k
                        for (int k = 0; k < nodesCount; k++) {
                            if (routingTable[i][k] != Integer.MAX_VALUE && routingTable[k][j] !=
                                    Integer.MAX_VALUE) {
                                int newDist = routingTable[i][k] + routingTable[k][j];
                                if (newDist < routingTable[i][j]) {
                                    routingTable[i][j] = newDist;
                                    updated = true; // Table updated
                                }
                            }
                        }
                    }
                }
            }
        } while (updated); // Repeat until no more updates
// Display the routing table
        System.out.println("\nPath Vector Routing (Final Routing Tables):");
        for (int i = 0; i < nodesCount; i++) {
            System.out.print("Routing Table for Node " + i + ": ");
            for (int j = 0; j < nodesCount; j++) {
                if (routingTable[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(routingTable[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Input the number of nodes (vertices)
        System.out.print("Enter the number of nodes: ");
        int nodesCount = sc.nextInt();
// Create the graph as an adjacency matrix (weights of edges)
        int[][] graph = new int[nodesCount][nodesCount];
        System.out.print("Enter the number of edges: ");
        int edgesCount = sc.nextInt();
        System.out.println("Enter the edges in the format (u, v, weight):");
        for (int i = 0; i < edgesCount; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            graph[u][v] = weight; // Directed edge from u to v with weight
        }
// Input source node for Bellman-Ford
        System.out.print("\nEnter the source node for Bellman-Ford: ");
        int source = sc.nextInt();
// Call Bellman-Ford algorithm
        bellmanFord(graph, nodesCount, source);
// Call Path Vector Routing algorithm
        pathVectorRouting(graph, nodesCount);
        sc.close();
    }
}
