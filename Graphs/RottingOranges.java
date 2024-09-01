import java.util.LinkedList;
import java.util.Queue;

import javax.print.attribute.standard.PageRanges;
import javax.swing.event.ListDataEvent;

public class RottingOranges {
    public static void main(String[] args) {
        
    }public int rottingOranges(int mat[N][M]){
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j<M ; j++){
                if(mat[i][j] == 2){
                    Pair p = new Pair(i , j , 0);
                    q.add(p);
            }
        }

        int ans = - 1; 

        while(q.size()>0){
            Pair rem = q.remove();
            
            int crow = rem.i;
            int ccol = rem.j;
            int ctime = rem.t;


            ans = ctime;
            //upper element --> Cheking if it is 1 it mean fresh 
            if(crow-1>0 && mat[crow-1][ccol]==1){
                q.add(new Pair(crow-1 , ccol , ctime-1));
                mat[crow-1][ccol] = 2;
            }


            //down element

            if(crow+1<n && mat[crow+1][ccol]==1){
                q.add(new Pair(crow+1 , ccol , ctime-1));
                mat[crow+1][ccol]=2;
            }
            //Similarly for right side and left side
        }
        return ans;
    }
}
