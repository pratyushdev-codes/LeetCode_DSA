public class SortZeroOneTwo{
    public static void main(String[] args) {
        
    }public static void sortzeroonetwo(int arr []){
        int n = arr.length;
        int i =0;
        int j=0;
        int k=n-1;



        while(j<=k){
            if(arr[j]==0){
                int temp = arr [i];
                arr[i]= arr[j];
                arr[j]= temp;
             

            }else if(arr[j]==1){
                j++;
            }else{
                int temp = arr[j];
                arr[j]=arr[k];
                arr[k]= temp;
            }
        }
    }
}