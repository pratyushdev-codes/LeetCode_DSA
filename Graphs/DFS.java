import java.util.*;
public class DFS {
    public static void main(String[] args) {
        
    }public ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj , int V ){

        ArrayList<Integer> ans = new ArrayList<>();
        boolean [] vis = new boolean[V];

        ans.add(0);
        vis[0] = true;
        DFSHelper(adj, 0, ans, vis);
        return ans;


    }public void DFSHelper(ArrayList<ArrayList<Integer>> adj , int src , ArrayList<Integer> ans , boolean [] vis ){
          for(int v: adj.get(src)){
            if(vis[v]==false){
                vis[v] = true;
                ans.add(v);
                DFSHelper(adj , v , ans , vis);
            }
          }
    }
}
