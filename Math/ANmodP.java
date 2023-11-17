//power of number mod m

import java.util.Scanner;

public class ANmodP{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        
    }public static void anmodp(int a, int n){
        long ans =1;
        int p=1000000007;
        for(int i=1;i<=n;i++){
            ans = ((ans%p)*(a%p)%p);

        }


System.out.println(ans);

    }
    
}