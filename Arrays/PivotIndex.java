import java.util.Scanner;

public class PivotIndex{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        

    }public int pivotIndex(int[] arr) {

         
          int n= arr.length;
        int prefixsum []= new int[n];
        prefixsum[0]=arr[0];
        for(int i=0;i<n;i++){
            prefixsum[i]= prefixsum[i-1]+arr[i];


        }
         
        int left = arr[0][i-1];
        int right= arr[i+1][n-1];
        
      if(left ==right){
        return arr;
      }
                
        }

    }
