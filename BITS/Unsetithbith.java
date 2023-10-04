import java.util.Scanner;

public class Unsetithbith{
    public static void main(String[] args) {
             Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

       unsetithbith(i, n);

    }public static  boolean checkithbit(int i, int n){
        if((n&(1<<i))==0){

            return false;
        }else{
            return true;
        }


     
}public static int unsetithbith(int i, int n){
       if(checkithbit(i, n)==true){

            int ans=(n^(1<<i));
                return ans;
            }else{
                return -1;
            }
        }
}
