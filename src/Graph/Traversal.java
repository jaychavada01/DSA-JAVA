package Graph;

import java.util.*;

public class Traversal {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[5].add(new Edge(6, 5));
    }

    public static void BFS(ArrayList<Edge> graph[], int V, boolean visited[], int start) {
        Queue<Integer> queue = new LinkedList<>();
        // boolean visited[] = new boolean[V];

        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (visited[current] == false) {
                System.out.print(current + " ");
                visited[current] = true;

                // add neighbors to queue, neighbors will be of current node then next visited
                // node
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e = graph[current].get(i);
                    queue.offer(e.dst);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[], int current, boolean visited[]) {
        System.out.print(current + " ");
        visited[current] = true;

        // add neighbors to queue, neighbors will be of next visited node
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (visited[e.dst] == false)
                DFS(graph, e.dst, visited);
        }
    }

    public static void main(String[] args) {
        int V = 7;
        /*
<<<<<<< HEAD
         *   1 -- 3
         *  /     | \
         * 0      |  5 -- 6
         *  \     | /
         *   2 -- 4
=======
         * 1 -- 3
         * / | \
         * 0 | 5 -- 6
         * \ | /
         * 2 -- 4
>>>>>>> be1699487030467f97eba0b3a6b2e56864672665
         */

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.print("BFS: ");

        // if graph has disconnected components then add this loop
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                BFS(graph, V, visited, i);
            }
        }
        // BFS(graph, vertics);
        
        System.out.println();

        boolean visitedDFS[] = new boolean[V];
        System.out.print("DFS: ");

        // if graph has disconnected components then...
        for (int i = 0; i < V; i++) {
            if (visitedDFS[i] == false) {
                DFS(graph, i, visitedDFS);
            }
        }
        // DFS(graph, 0, visitedDFS);
    }
}
