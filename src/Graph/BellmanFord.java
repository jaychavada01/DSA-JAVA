package Graph;

/*
 * Shortest distance from source to all vertices
 * works for +ve and -ve weighted edges
 * Dynamic Programming approach
 */

import java.util.ArrayList;

public class BellmanFord {
    static class Edge {
        int src;
        int dst;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // create empty arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // creation of graph
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src, int V) {
        int distance[] = new int[V];

        for (int i = 0; i < V; i++) {
            if (i != src) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        for (int k = 0; k < V - 1; k++) { // O(V)
            // O(E)
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int v = e.dst;

                    if(distance[u] != Integer.MAX_VALUE && distance[u] + e.wt < distance[v]){
                        distance[v] = distance[u] + e.wt;
                    }
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0, V);
    }
}
