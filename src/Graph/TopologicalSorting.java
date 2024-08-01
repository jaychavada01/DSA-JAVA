package Graph;

/*
 * Topological sorting only possible for Directed Acyclic Graph which has directed edges but no cycles.
 * It means it is a linear order of vertices such that every directed edge u -> v, the vertex u comes first in order.
 * Time complexity O(V+E)
 */

import java.util.*;

public class TopologicalSorting {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // we will use DFS just one new parameter we will use is stack for push-pop operations
    public static void topological(ArrayList<Edge> graph[], int current, boolean visited[], Stack<Integer> stack){
        visited[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);

            if(!visited[e.dst]){
                topological(graph, e.dst, visited, stack);
            }
        }
        stack.push(current);
    }

    public static void topSort(ArrayList<Edge> graph[], int V){
        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                topological(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.print("Topological sort : ");
        topSort(graph, V);
    }
}
