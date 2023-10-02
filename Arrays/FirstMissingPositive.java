import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] < 1 || nums[i] > n || i == nums[i] - 1) {
                i++;
            } else {
                int idx = nums[i] - 1;
                if (nums[i] == nums[idx]) {
                    i++;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (j != nums[j] - 1) {
                return j + 1;
            }
        }

        return n + 1;
    }
}
