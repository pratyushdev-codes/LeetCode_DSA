import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    public static void main(String[] args) {
        // You can test the topologicalSort function here.
    }

    public static void topologicalSort(List<List<Integer>> graph, int V) {
        int indegree[] = new int[V];

        // Calculate the in-degree of each vertex
        for (int u = 0; u < V; u++) {
            List<Integer> nbrs = graph.get(u);
            for (int v : nbrs) {
                indegree[v]++;
            }
        }

        // Initialize the queue with vertices having 0 in-degree
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Process the vertices in topological order
        while (!q.isEmpty()) {
            int rem = q.remove();
            System.out.println(rem);

            List<Integer> nbrs = graph.get(rem);
            for (int v : nbrs) {
                indegree[v]--;

                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }
    }
}
