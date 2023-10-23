import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s=sc.nextInt();
        int e=sc.nextInt();
        customMethod(arr, s, e);
    }

    public static int customMethod(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
        if(arr[i]<1|| arr[i]>n||i==arr[i]-1){
            i++;
        }else{
            int idx=arr[i]-1;
            if(arr[i]==idx){
                i++;
            }else{
                int temp =i;
                i=idx;
                idx=temp;
            }
        }
        }for(int j=0;j<n;j++){
            if(j!=arr[j]-1){
                return j+1;
            }
        }
       return n+1;
    }
}
           