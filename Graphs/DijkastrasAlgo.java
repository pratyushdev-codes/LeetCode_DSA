import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution
{
    public static class Pair implements Comparable<Pair>{
        int vtx,wsf;
        Pair(int vtx,int wsf){
            this.vtx = vtx;
            this.wsf = wsf;
        }
        public int compareTo(Pair O){
            return this.wsf - O.wsf;
        }
    }
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int[] ans = new int[V];
        Arrays.fill(ans,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(S,0));
        while(pq.size()>0){
            Pair rem = pq.remove();
            if(ans[rem.vtx] != Integer.MAX_VALUE) continue;
            
            ans[rem.vtx] = rem.wsf;
            for(ArrayList<Integer> e : adj.get(rem.vtx)){
                int nbr = e.get(0);
                int wt = e.get(1);
                if(ans[nbr]!=Integer.MAX_VALUE) continue;
                pq.add(new Pair(nbr , rem.wsf+wt));
            }
            
        }
        return ans;
        
    }
}
