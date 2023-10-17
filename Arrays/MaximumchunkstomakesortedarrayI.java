import java.util.Scanner;

public class MaximumchunkstomakesortedarrayI{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    System.out.println(maxiumchunksi(arr));
        
    }public static int maxiumchunksi(int arr []){
          int n=arr.length;
        int maxtillnow=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            maxtillnow=Math.max(maxtillnow,arr[i]);
            if(maxtillnow==i){
                count++;
            }
        }
        return count;
    }
}