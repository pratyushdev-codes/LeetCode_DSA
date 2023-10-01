public class NumberofSubarrayswithboundedmaximum{
    public static void main(String[] args) {
        
    } public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        int ans = 0;
        int lgei = 0;
        int previousvalidcount = 0;
        for(int ep = 0; ep < n; ep++) {
            if(nums[ep] > right) {
                lgei = ep + 1;
                previousvalidcount = 0;
            } else if(nums[ep] >= left && nums[ep] <= right) {
                ans += (ep - lgei + 1);
                previousvalidcount = ep - lgei + 1;
            } else {
                ans += previousvalidcount;
            }
        }
        return ans;
    }
}

