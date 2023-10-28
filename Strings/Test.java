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
        kadane(arr);
    }

    public static int kadane(int arr[]){
        int n=arr.length;
        int sum =0;
        int ans =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(sum>0){
                sum=sum+arr[i];

            }else{
                sum=arr[i];
            }
            ans= Math.max(ans, sum);
        }
        return ans;
       
    }
}
           