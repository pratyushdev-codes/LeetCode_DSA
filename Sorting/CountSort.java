import java.util.*;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countSort(arr);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void countSort(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create an array to store the count of each element
        int count[] = new int[max + 1];

        // Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            count[val]++;
        }

        // Reconstruct the sorted array
        int k = 0;
        for (int i = 0; i <= max; i++) {
            int c = count[i];
            for (int j = 0; j < c; j++) {
                arr[k] = i;
                k++;
            }
        }
    }
}
