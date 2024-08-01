package Graph;

import java.util.*;

public class CyclicGraph {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited[], int current,
            boolean recursiveStack[]) {
        visited[current] = true;
        recursiveStack[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (recursiveStack[e.dst]) {
                // cycle
                return true;
            } else if (!visited[e.dst]) {
                if (isCycleDirected(graph, visited, e.dst, recursiveStack)) {
                    return true;
                }
            }
        }
        recursiveStack[current] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean visited[] = new boolean[V];
        boolean recursiveStack[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                boolean isCycle = isCycleDirected(graph, visited, 0, recursiveStack);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}
