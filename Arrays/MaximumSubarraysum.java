import java.util.Scanner;

public class MaximumSubnumsaysum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums = new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int ans = kadane(nums);
        System.out.println(ans);
    }public static int kadane(int []nums){
        int n=nums.length;
        int sum =0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum>0){
                sum=sum+nums[i];
            }else{
                sum=nums[i];


            }
            ans = Math.max(ans, sum);

        }
        return ans;

    }
}