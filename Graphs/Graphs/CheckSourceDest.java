import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheckSourceDest {
    public static void main(String[] args) {
        // Example usage of BSF (which should be renamed to BFS)
        int n = 5;
        int m = 4;
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 3},
            {2, 4}
        };
        int sourceNode = 0;
        int destinationNode = 3;

        CheckSourceDest csd = new CheckSourceDest();
        boolean pathExists = csd.BFS(n, m, edges, sourceNode, destinationNode);
        System.out.println("Path exists: " + pathExists);
    }

    public boolean BFS(int n, int m, int[][] edges, int sn, int en) {
        List<List<Integer>> graph = constructGraph(n, m, edges);
        boolean[] vis = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(sn);
        vis[sn] = true;

        while (!q.isEmpty()) {
            int rem = q.remove();

            // Check if the destination node is reached
            if (rem == en) {
                return true;
            }

            // Adding all unvisited neighbors
            List<Integer> nbrs = graph.get(rem);
            for (int v : nbrs) {
                if (!vis[v]) {
                    q.add(v);
                    vis[v] = true;
                }
            }
        }

        // If the queue is empty and the destination node was not reached
        return false;
    }

    private List<List<Integer>> constructGraph(int n, int m, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            // If the graph is undirected, uncomment the following line:
            // graph.get(v).add(u);
        }

        return graph;
    }
}
