import java.util.Scanner;

public class PowerofNumbermodm{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();

        long ans = 1;
        int m= 1000000007;

        for(int i =0;i<=n;i++){
            ans = ((ans%m )*(a%m))%m;
        }
        System.out.println(ans);
    }

}