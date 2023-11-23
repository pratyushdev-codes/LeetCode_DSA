// In the insertionCount method, the variable temp[P3]= temp[P2]; should be temp[P3]= arr[P2]; to copy the value from the original array.

// In the insertionCount method, you need to return the ans variable.

// The insertionCount method has a return type of void, but you are trying to print its result in the main method. Change the return type to int and return the ans variable.





import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(insertionCount(arr, s, m, e));
    }

    public static int insertionCount(int arr[], int s, int m, int e) {
        int[] temp = new int[e - s + 1];
        int P1 = 0;
        int P2 = s;
        int P3 = 0;
        int ans = 0;

        while (P1 < s && P2 <= e) {
            if (arr[P1] <= arr[P2]) {
                temp[P3] = arr[P1];
                P3++;
                P1++;
            } else {
                temp[P3] = arr[P2];
                P3++;
                P2++;
                ans = ans + (m - P1 + 1);
            }
        }

        while (P1 < s) {
            temp[P3] = arr[P1];
            P3++;
            P1++;
        }

        while (P2 <= e) {
            temp[P3] = arr[P2];
            P3++;
            P2++;
        }

        // Copy elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[s + i] = temp[i];
        }

        return ans;
    }
}
