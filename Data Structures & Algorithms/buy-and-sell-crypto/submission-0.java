class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        for(int i=0;i<len;i++){
            int l = i;
            int r = len -1;
            while(l<r){
                if(prices[l] < prices[r]){
                    int profit = prices[r] - prices[l];
                    maxProfit = Math.max(maxProfit,profit);
                }
                r--;
            }

        }
        return maxProfit;   
    }
}
