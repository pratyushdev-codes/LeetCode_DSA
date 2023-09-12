// 66. Plus One
// Easy

// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

https://leetcode.com/problems/plus-one/description/

// Approach:

// The general approach to solving this problem is as follows:

// Start from the least significant digit (which is at the end of the array).
// Add 1 to it. If it's less than 10, we're done.
// If it's 10, set it to 0 and move to the next digit.
// Continue this process until you reach a digit that doesn't become 10 after adding 1. At this point, you're done.
// However, you need to be careful when the last digit is 9, as it might cause a carry-over operation that could affect other digits. This is why we iterate from right to left, and potentially add a new digit if needed.

import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] result = plusOne(arr);
        
        // Print the result
        System.out.println(Arrays.toString(result));
    }
    
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits; // Return the modified array
            }
        }

        // If we reach here, it means all digits were 9, so we need to add an extra digit
        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}

