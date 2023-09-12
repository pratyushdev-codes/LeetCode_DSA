// 35. Search Insert Position
// Easy
// 14.6K
// 626
// Companies
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

//  https://leetcode.com/problems/search-insert-position/

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2




import java.util.Scanner;

public class SearchInsertPosition{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr []= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int result= insertPosition(arr, k);
        System.out.println(result);

    }public static int insertPosition(int arr [],int k){
           
           int lo= 0;
           int high=arr.length-1;
           while(lo<high){
            int mid= lo+(high-lo)/2;

            if(arr[mid]==k){
                return mid;
            } else if (arr[mid] < k) {
                lo = mid + 1;
            } else {
                high= mid - 1;
            }
        }


        return lo;
    }
}









         
    
