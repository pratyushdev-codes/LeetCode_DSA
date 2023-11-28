import java.util.*;

public class GridIllumination {
    public static void main(String[] args) {

    }public class int [] gridIllumination(int n, int [][] lamps, int [][] queries){
        int n=lamps.length;ß
        HashMap <Integer, Integer> m1, m2, m3,m4, m5;
        m1= new HashMap<>();
        m2= new HashMap<>();
        m3= new HashMap<>();
        m4= new HashMap<>();
        m5= new HashMap<>();

        for(int i=0;i<n;i++){
            int x= lamps[i][0];
            int y=lamps[i][1];

            m1.put(x , m1.getOrDefault(x,0) + 1);
            m2.put(y, m2.getorDefault(x,0)+1);3

        }




    }
}