import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();  // number of nodes
        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();  // number of edges
        
        int[][] edges = new int[m][2];


        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        sc.close();  
        
        BFS(n, m, edges);
    }

    public static void BFS(int n, int m, int[][] edges) {
        List<List<Integer>> graph = constructGraph(n, m, edges);

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.add(0); // Start BFS from node 0 (or any other starting node)
        vis[0] = true;

        System.out.println("BFS traversal starting from node 0:");

        while (!q.isEmpty()) {
            int rem = q.remove();
            System.out.print(rem + " ");  // Process the current node

            List<Integer> nbrs = graph.get(rem);
            for (int v : nbrs) {
                if (!vis[v]) {
                    q.add(v);
                    vis[v] = true;
                }
            }
        }
    }

    public static List<List<Integer>> constructGraph(int n, int m, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());  
        }

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }
}
