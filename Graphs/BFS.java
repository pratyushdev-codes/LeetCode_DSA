import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {


        
    }public static void BFS(int n , int m , int [][] edges){
       List<List<Integer>> graph = construction(n , m , edges);


       Queue<Integer> q= new LinkedList<>();

       boolean [] vis = new boolean[n];

       q.add(0);
       vis[0]= true;

       while(q.size()>0){
        int rem = q.remove();


        List<Integer> nbrs= graph.get(rem);
        for(int v:nbrs){
            if(vis[v]==false){
                q.add(v);
                vis[v]=true;
            }
        }
       }

       //adding all unvisited neighbours


       
    }
}
