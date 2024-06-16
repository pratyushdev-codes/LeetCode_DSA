/**
 * NoofsubsetinSumK
 */
public class NoofsubsetinSumK {

    public static void main(String[] args) {
        
    }public static void subsetSum(int arr [], int k , int i , int sum){
        int ans =0;
        if(i == arr.length){
           if(sum==k){
                ans = ans +1;
                return;
           } 

           subsetSum(arr, k, i+1, sum+ arr[i]);

           subsetSum(arr, k , i-1, sum);
    }

}
}