package Graph;

import java.util.*;

public class CycleDetection {
    static class Edge {
        int src;
        int dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        // create empty arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // creation of graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));

        /*
         *   1 --- 2 --- 3
         * / |
         * 0 |
         * \ |
         *   4 --- 5
         */
    }

    public static boolean isCycleUnDirected(ArrayList<Edge> graph[], boolean visited[], int current, int parent) {
        visited[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);

            if (visited[e.dst] && e.dst != parent) {
                return true;
            } else if (!visited[e.dst]) {
                if (isCycleUnDirected(graph, visited, e.dst, current)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Cycle detected in undirected graph: " + isCycleUnDirected(graph, new boolean[V], 0, -1));
    }
}