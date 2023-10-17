import java.util.Scanner;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
         int count = 0;
        int max=0;
     for(int i = 0 ;i<nums.length;i++){
         if(nums[i] == 1){
             count++;
            max = Math.max(max,count);
         }
         else{
             count  = 0;
         }
       
     }
    return max;
    }
}