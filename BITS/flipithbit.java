import java.util.Scanner;

public class flipithbit{
    public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

       
        System.out.println(flipithbit(i, n));

    }public static int flipithbit(int i, int n){
        int ans = (n^(1<<i));
        return ans;
    }
}