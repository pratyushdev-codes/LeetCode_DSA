class Solution {
    public int maxProfit(int[] prices) {
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0 ;


        for(int i = 0 ; i< prices.length; i++){
            if(prices[i]<minProfit){
                minProfit = prices[i];
            }

            int currentProfit= prices[i]- minProfit;

            if(currentProfit>maxProfit)  maxProfit = currentProfit;

        }
        return maxProfit ;
} 
}