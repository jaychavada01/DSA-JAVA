package Graph;

import java.util.ArrayList;

public class FindPath {
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

    /*
     * Here we used modified version of DFS. Reason is in DFS we visit any vertex we add true in visited array but in this case we backtrack so we again put false in place of true in visited array.
     * Time complexity: O(V^V)
     */

    public static void printAllPath(ArrayList<Edge> graph[], boolean visited[], int current, String path, int target){
        if(current == target){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            
            if(!visited[e.dst]){// neighbor not visited
                visited[current] = true;
                // call for neighbor
                printAllPath(graph, visited, e.dst, path+e.dst, target);
                visited[current] = false;
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        /*
         *  1 -- 3
         *  /    | \
         * 0     |  5 -- 6
         *  \    | /
         *  2 -- 4
         */

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println("Printing all path from src to dst: ");
        int src = 0; int target = 5;
        printAllPath(graph, new boolean[V], src, "0", target);
    }
}
