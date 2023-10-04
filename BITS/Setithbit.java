import java.util.*;
public class Setithbit{
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

       System.out.println(setithbit(i, n)); 

    }
    public static  int setithbit(int i, int n){
       int ans = (n|(1<<i));
       return ans;
    }
}