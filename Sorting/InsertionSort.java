import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    
        int arr []= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
insertionSort(arr);

    }public static void insertionSort(int arr []){
        int n=arr.length;
        for(int j=n-2;j>=0;j--){
            if(arr[j]>arr[j++]){
                int temp=arr[j];
                arr[j+1]=arr[j];
                arr[j+1]=temp;
            }else{
                break;
            }

        }
    }
}
