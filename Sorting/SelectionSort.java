import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();  //size of array
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }public static void selectionSort(int arr []){
        int n=arr.length;

for(int i=0;i<n;i++){
    int minelement=arr[i];
    int minindex=1;

    for(int j=i+1;j<n;j++){
        if(minelement>arr[j]){
            minelement=arr[j];
            minindex=j;
            }
}
int temp=arr[i];
arr[i]=arr[minindex];
arr[minindex]=temp;
    }
}
}
