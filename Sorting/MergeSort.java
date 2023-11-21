import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Second Array:");
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

    }

    public static void mergerSort(int arr[], int s, int e) {
        if (s < e) {

            int m = (s + e) / 2;
            mergerSort(arr, s, m);
            mergerSort(arr, m + 1, e);

            mergesortHelper(arr, s, m, e);

        }
    }

    public static int[] mergesortHelper(int arr[], int s, int m, int e) {
        int temp[] = new int[e - s + 1];
        int P1 = s;
        int P2 = m + 1;
        int P3 = e;

        while (P1 < m && P2 < e) {

            if (arr[P1] < arr[P2]) {
                temp[P3] = arr[P1];
                P3++;
                P1++;
            } else {
                temp[P3] = arr[P2];
                P3++;
                P2++;
            }
        }

        while (P1 < m) {
            temp[P3] = arr[P1];
            P3++;
            P1++;
        }
        while (P2 < e) {
            temp[P3] = arr[P2];
            P3++;
            P2++;
        }
        return temp;
    }

}
