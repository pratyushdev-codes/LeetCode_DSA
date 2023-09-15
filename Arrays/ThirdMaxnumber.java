// 414. Third Maximum Number
// Easy
// Topics
// Companies
// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

// Example 1:

// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Example 2:

// Input: nums = [1,2]
// Output: 2
// Explanation:
// The first distinct maximum is 2.
// The second distinct maximum is 1.
// The third distinct maximum does not exist, so the maximum (2) is returned instead.
// Example 3:

// Input: nums = [2,2,3,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2 (both 2's are counted together since they have the same value).
// The third distinct maximum is 1.


// https://leetcode.com/problems/third-maximum-number/description/


import java.util.*;

public class ThirdMaxnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Added () after nextInt
        }

        int result = thirdMax(arr);
        System.out.println(result);
        
        
    }public static int thirdMax(int[] arr) {
        int n=arr.length;
        int count=1;
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            if(arr[0]==arr[i+1]){
                i++;
                
            }
            }
            return -1;
            
        }
        
    }

