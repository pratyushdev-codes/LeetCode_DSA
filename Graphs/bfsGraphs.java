import java.util.*;
public class bfsGraphs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       //Input - No of Nodes
       int n = sc.nextInt();
       //Input - No of Edges
       int m = sc.nextInt();
        
       int [][] edges = new int [m][2];
       for(int i = 0 ; i<m; i++){
        edges[i][0] = sc.nextInt();
        edges[i][1] = sc.nextInt();
       }
        
       BFS(n,m, edges);
    }
    //BFS - Level Order Code
    public static void BFS(int n , int m , int [][] edges){
        List<List<Integer>> graph = constructGraph(n,m, edges);
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[n];

        queue.add(0);
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int rem= queue.remove();
            
            List<Integer> nbrs= graph.get(rem);
            for(int v : nbrs){
                if(!visited[v]){
                    queue.add(v);
                    visited[v] = true;
                }
            }

        }
    }
    public static List<List<Integer>> constructGraph(int n , int m , int [][]edges){
                 List<List<Integer>> graph = new ArrayList<>();
                 
           for(int i = 0 ; i<n ; i++){
            graph.add(new ArrayList<>());

           }
           for(int i = 0 ;i<m ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
           }
           return graph;
    }
}
