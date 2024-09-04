import java.util.*;



public class BFSTrial {
    public static void main(String[] args) {
        
    }public ArrayList<Integer> bfsOfGrapgh(ArrayList<ArrayList<Integer>> adj, int V){
        Queue<Integer> q = new LinkedList<>(); //queue used for BFS
        boolean vis [] = new boolean [V]; //visited Array to keep track it the node is visited or not
        ArrayList<Integer> ans = new ArrayList<>(); //ArrayList that will save the traversal answer
        
        q.add(0);
        vis[0]= true;
        while(!q.isEmpty()){
            int rem = q.poll();

            ans.add(rem);
            
            for(int v: adj.get(rem)){
                if(vis[v]==false){
                    vis[v]=true;
                    q.add(v);
                }
            }

            
        }
        return ans;

    }
}
