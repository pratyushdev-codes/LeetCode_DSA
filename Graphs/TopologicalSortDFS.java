import java.util.*;

public class TopologicalSortDFS {

    // Helper method for DFS traversal
    public void DFS(ArrayList<ArrayList<Integer>> adj, int u, Stack<Integer> st, boolean[] vis) {
        // Mark the current node as visited
        vis[u] = true;

        // Recur for all adjacent vertices
        for (int v : adj.get(u)) {
            if (!vis[v]) {
                DFS(adj, v, st, vis);
            }
        }

        // Push the current node to the stack
        st.push(u);
    }

    // Method to perform topological sort
    public ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];

        // Call the recursive helper function to store the topological sort
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                DFS(adj, i, st, vis);
            }
        }

        // Store the result in a list
        ArrayList<Integer> ans = new ArrayList<>();

        // Pop all elements from the stack and add to the result
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }

}