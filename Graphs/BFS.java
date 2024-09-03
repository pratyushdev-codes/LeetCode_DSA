import java.util.*;
public class BFS {
    public static void main(String[] args) {
        

    //taking graph input here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();//nodes
    int m = sc.nextInt();//edges

    int edges[][] = new int[m][2];

    for(int i = 0 ; i < m ; i++){
        edges[i][0]= sc.nextInt();
        edges[i][1]= sc.nextInt();

    }

}    public static void BFS(int [][] edges , int n , int m){
        List<List<Integers>> graph = constructGraph( edges , n , m);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];


        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int rem =  queue.poll();

            List<Integer> nbrs = graph.get(rem);
            for(int v:nbrs){
                if(!visited[v]){
                    queue.add(v);
                    visited[v]=true;
                }
            }
        }
    }  public static List<List<Integer>> constructGraph(int [][] edges , int n , int m){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i< n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i< m ; i++){
            int u= edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }

    






}