import java.util.Scanner;

public class Trappingrainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = rainWater(arr);
        System.out.println(ans);
    }

    public static int rainWater(int arr[]) {
        int n = arr.length;
        int amount = 0;
        int pfmax[] = func1(arr);
        int sfmax[] = func2(arr);
        for (int i = 1; i < n - 1; i++) {
            int lb = pfmax[i - 1];
            int rb = sfmax[i + 1];

            int overallb = Math.min(lb, rb);

            int contribution = overallb - arr[i];
            if (contribution > 0) {
                amount += contribution;
            }
        }
        return amount;
    }

    public static int[] func1(int[] arr) {
        int n = arr.length;

        int[] pfmax = new int[n];
        pfmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pfmax[i] = Math.max(pfmax[i - 1], arr[i]);
        }
        return pfmax;
    }

    public static int[] func2(int[] arr) {
        int n = arr.length;

        int[] sfmax = new int[n];
        sfmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sfmax[i] = Math.max(sfmax[i + 1], arr[i]);
        }
        return sfmax;
    }
}
