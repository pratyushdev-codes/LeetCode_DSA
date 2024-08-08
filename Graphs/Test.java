import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] edges = new int[n][m];

        for(int i = 0 ; i< m ; i++){
            edges[i][0]= sc.nextInt();
            edges[i][1]= sc.nextInt();

        }
        construction(n, m, edges);

    }public void construction(int n , int m , int [][] edges){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i< n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i< m; i ++){
            int u =edges[0][i];
            int v = edges[i][0];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

    }
}
