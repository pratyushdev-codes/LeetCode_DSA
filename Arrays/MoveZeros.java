// https://leetcode.com/problems/move-zeroes/

// 283. Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]


import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Read the number of elements in the array.
        int n = sc.nextInt();
        
        // Step 2: Create an array of integers with the given number of elements.
        int arr[] = new int[n];
        
        // Step 3: Read the elements of the array.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Step 4: Call the moveZeroes method to move zeros to the end of the array.
        moveZeroes(arr);
        
        // Step 5: Print the modified array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        // Step 6: Initialize a variable 'lastNonZero' to keep track of the last position
        // where a non-zero element was moved.
        int lastNonZero = 0;

        // Step 7: Use a loop to iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            // Step 8: Check if the current element is not zero.
            if (nums[i] != 0) {
                // Step 9: If it's not zero, swap it with the last non-zero element.
                int temp = nums[i];
                nums[i] = nums[lastNonZero];
                nums[lastNonZero] = temp;

                // Step 10: Move the 'lastNonZero' position forward.
                lastNonZero++;
            }
        }
    }
}
