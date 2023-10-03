
// https://leetcode.com/problems/search-in-rotated-sorted-array/

import java.util.Scanner;

public class SearchinRotatedSortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int lo = 0; // Changed 'lo' initialization to 0
        int hi = nums.length - 1; // Changed 'hi' initialization to length - 1

        while (hi >= lo) { // Changed condition to 'hi >= lo'
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[lo] <= nums[mid]) {
                if (nums[lo] <= target && target <= nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}
