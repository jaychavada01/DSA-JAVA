package Graph;

/*
 * Shortest distance from source to all vertices
 * works only for +ve weighted edges
 * Greedy approach - means gives minimum path if graph have
 */
import java.util.*;

public class DijkstraAlgo {
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

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int distance;

        public Pair(int node, int distance){
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair p2){
            // sorting base on ascending order
            return this.distance - p2.distance;
            // for descending order
            // return p2.distance - this.distance;
        }
    }

    // Time complexity: O(E + E logV)
    public static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int distance[] = new int[V];

        for (int i = 0; i < V; i++) {
            if(i != src){
                distance[i] = Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[V];
        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()){
            Pair current = pq.remove(); // shortest path
            if(!visited[current.node]){
                visited[current.node] = true;

                // neighbor edge count with min distance
                for (int i = 0; i < graph[current.node].size(); i++) {
                    Edge e = graph[current.node].get(i);
                    int u = e.src;
                    int v = e.dst;

                    // relaxation
                    if(distance[u] + e.wt < distance[v]){
                        distance[v] = distance[u] + e.wt;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(distance[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0, V);
    }
}
