import java.util.Scanner;

public class TransposeMatrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr [][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();


            }
        
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(tansposeMatrix(arr));

            }
        }

    }public static int [][] tansposeMatrix(int[][] arr ){
          int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int temp =arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;

            }
        }
    }
}