import java.util.*;;
public class LongestIncreasingSubsequence {
public static void main(String[] args) {
    
}
    
} public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    int dp [] = new int [n];
    Arrays.fill(dp, 1);
    int ans = 0;

    for(int i = 0 ; i < n ; i++){
        int lo = 0;
        int hi = ans;
   

        while(lo<hi){
            int mid = lo+(hi-lo)/2;

            if(dp[mid]<nums[i]){
                lo = mid+1;
            }else{
                hi = mid;
            }
            dp[lo]= nums[i];
            if(lo == ans) ans++;


        }
        return ans;
    }








}