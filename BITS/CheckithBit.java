import java.util.*;
public class CheckithBit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();

        checkithbit(i, n);

    }
    public static  boolean checkithbit(int i, int n){
        if((n&(1<<i))==0){

            return false;
        }else{
            return true;
        }
        }
    }
    
