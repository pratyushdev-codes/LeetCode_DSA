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
        customMethod(arr, s, e);
    }

    public static void customMethod(int arr[], int s, int e){
        int n = arr.length;

        for(int x = s; x < n; x++){
            for(int y=s;y<e;y++){

                for(int i=x;i<y;i++){
                    System.out.print(arr[i] + " ");
                    System.out.println();
                }
            }
        }
    }
}
           