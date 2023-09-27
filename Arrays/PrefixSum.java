// 1480. Running Sum of 1d Array
// Easy
// Topics
// Companies
// Hint
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Example 2:

// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
// Example 3:

// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]

// https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.*;

public class PrefixSum{
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int[] prefixSums = prefixSum(arr);

    // Printing prefix sums
    for(int i = 0; i < n; i++) {
        System.out.print(prefixSums[i] + " ");
    }
        
    }
   
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];

        for(int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }
    }
