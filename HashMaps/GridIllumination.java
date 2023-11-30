import java.util.*;

public class GridIllumination {
    public static void main(String[] args) {

    }public class int [] gridIllumination(int n, int [][] lamps, int [][] queries){
       
        HashMap <Integer, Integer> m1, m2, m3,m4, m5;
        m1= new HashMap<>();
        m2= new HashMap<>();
        m3= new HashMap<>();
        m4= new HashMap<>();
        m5= new HashMap<>();

        for(int i=0;i<queries.length;i++){
            int x= lamps[i][0];
            int y=lamps[i][1];

            m1.put(x , m1.getOrDefault(x,0) + 1);
            m2.put(y, m2.getOrDefault(y,0)+1);
            m3.put(x-y, m3.getOrDefault(x-y,0)+1);
            m4.put(x+y, m4.getOrDefault(x+y,0)+1);
            m5.put(x*n+y , m5.getOrDefault(x*n+y,0) + 1);

        }
        int [] ans = new int[queries.length];
        int [] directions ={{-1,0},{-1,1}, {0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{0,0}};
        for (int i=0 ;i<queries.length;i++) {
            int queries 



        }




    }
}