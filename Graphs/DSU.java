
// This code can be use for connected components as well as Disjoint set union
public class DSU {
    int [] rank;
    int [] par;

    public int connectComponnet(int [][] isConnected){
        int n = isConnected.length;
        par = new int [n];
        rank = new int [n];

        for(int i = 0 ; i<n ; i++){
            par[i] = i ; 
            rank[i] = 1;
        }
        for(int i =0 ; i <n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(isConnected[i][j]==1){
                    Union(i , j);
                }
            }
        }
        int ans = 0 ;
        for(int i =0 ; i< n ; i++){
            if(par[i]==i) ans ++;

        }
        return ans ;


    }public void Union(int a , int b ){
        int px = find(a);
        int py = find(b);



        if(px==py) return ;

        if(rank[px]>rank[py]){

            par[py] = px ;

        }else{
            par[px]= py;
            rank[py]++;
        }
    }public int find(int x){
        if(x==par[x]) return x;

        int temp = find(par[x]);
        par[x]= temp;
        return temp;
    }
}
