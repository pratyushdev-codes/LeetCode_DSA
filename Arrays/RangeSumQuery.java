// 303. Range Sum Query - Immutable
// Easy
// Topics
// Companies
// Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
// https://leetcode.com/problems/range-sum-query-immutable/description/

import java.util.Arrays;

public class RangeSumQuery {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        int result1 = numArray.sumRange(0, 2);
        System.out.println("Sum of elements from index 0 to 2: " + result1); // Output: 1

        int result2 = numArray.sumRange(2, 5);
        System.out.println("Sum of elements from index 2 to 5: " + result2); // Output: -1

        int result3 = numArray.sumRange(0, 5);
        System.out.println("Sum of elements from index 0 to 5: " + result3); // Output: -3
    }

    static class NumArray {
        int[] pf;

        public NumArray(int[] nums) {
            int n = nums.length;
            pf = new int[n];
            pf[0] = nums[0];
            for (int i = 1; i < n; i++) {
                pf[i] = pf[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if (left > 0) {
                return pf[right] - pf[left - 1];
            } else {
                return pf[right];
            }
        }
    }
}
