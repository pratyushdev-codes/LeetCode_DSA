import java.util.Scanner;

public class Productofarrayexcpetitself{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }  public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        
        // Calculate product of elements to the left
        pf[0] = 1;
        for(int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] * arr[i - 1];
        }
        
        // Calculate product of elements to the right
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--) {
            pf[i] = pf[i] * suffix;
            suffix = suffix * arr[i];
        }
        
        return pf;
    }
}
