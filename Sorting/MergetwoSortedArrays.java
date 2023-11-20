import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Array:");

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second Array:");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] result = MergeTwoSortedArray(arr, arr1);
        // Print the merged array
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

        public static int[] MergeTwoSortedArray(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] c = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        
        while(p1<n && p2<m){
            if(a[p1] < b[p2]){
                c[p3] = a[p1];
                p3++;
                p1++;
            }else{
                c[p3] = b[p2];
                p3++;
                p2++;
            }
        }
        
        while(p1 < n){
            c[p3] = a[p1];
            p3++;
            p1++;
        }
        
        while(p2 < m){
            c[p3] = b[p2];
            p3++;
            p2++;
        }
        
        return c;
        
    }
}
