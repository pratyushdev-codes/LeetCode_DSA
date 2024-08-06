import java.util.*;

public class GraphInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // number of edges
        int n = sc.nextInt();  // number of nodes
        
        int[][] edges = new int[m][2];

        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        sc.close();  
        
        construct(m, n, edges);
    }

    public static void construct(int m, int n, int[][] edges) {
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
//Print the graph to verify the construction
        for (int i = 0; i < graph.size(); i++) {
            System.out.println("Node " + i + ": " + graph.get(i));
        }
    }
}
