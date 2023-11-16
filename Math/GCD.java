public class GCD{
    public static void main(String[] args) {
        
    }class Solution {
        public int findGCD(int[] nums) {
            int max = nums[0];
            int min = nums[0];
            for(int num: nums){
                max = (num > max) ? (num) : (max);
                min = (num < min) ? (num) : (min);
            }
            return gcd(max, min);
        }
        private static int gcd(int a, int b){
            if(a == 0 || b == 0){
                return a^b;
            }
            if(b > a){
                return gcd(b, a);
            }
            return gcd(a%b, b);
        }
    }
}