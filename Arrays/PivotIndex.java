import java.util.Scanner;

public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = pivotIndex(arr);
        System.out.println("Pivot Index: " + result);
    }

    public static int pivotIndex(int[] arr) {
        int n = arr.length;
        int prefixsum[] = new int[n];
        prefixsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int left;
            if (i == 0) {
                left = 0;
            } else {
                left = prefixsum[i - 1];
            }
            int right = prefixsum[n - 1] - prefixsum[i];
            if (left == right) {
                return i;
            }
        }

        return -1; // Return -1 if no pivot index is found
    }
}
