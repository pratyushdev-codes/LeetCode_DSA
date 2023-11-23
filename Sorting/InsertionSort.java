import java.util.*;


public class InsertionSort {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
   int arr [] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

insertionsort(arr);

 }public static void insertionsort(int arr[]){
int n = arr.length;
      for(int i=0;i<n;i++){
for(int j=i-1;j>=0;j--){
    if(arr[j]>arr[j+1]){
        int temp =arr[j];
        arr[j]=arr[j+1];
        arr[j+1]= temp;
    }else{
        break;
    }
}
}
}
}
