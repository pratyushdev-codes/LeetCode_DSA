import java.util.Scanner;

public class Searchin2Dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        boolean result = searchin2dMatrix(matrix, target);
        System.out.println("Result: " + result);
    }

    public static boolean searchin2dMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int lo = 0;
        int hi = n * m - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int r = mid / m;
            int c = mid % m;

            if (arr[r][c] == target) {
                return true;
            } else if (arr[r][c] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }
}
