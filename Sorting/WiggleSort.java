import java.util.Scanner;

public class WiggleSort{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        wiggleSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }public static void wiggleSort(int arr []){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }else{
                    if(arr[i]<arr[i+1]){
                        int temp = arr[i];
                        arr[i]=arr[i+1];;
                        arr[i+1]= temp;
                    }
                }
            }
        }
    }
}