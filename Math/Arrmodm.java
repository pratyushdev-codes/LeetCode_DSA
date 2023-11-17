import java.util.*;

public class Arrmodm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p=1000000007;
       
    }public static void arrmodm (int arr [], int p){
        long num=0;
        long mult=1;
        for(int i=n-1;i>=0;i--){
            num = (num % p + ((arr[i] % p)*(mult % p)) % p) % p;
            mult = (mult * 10) % p;
        }
        System.out.println(num);

    }
}