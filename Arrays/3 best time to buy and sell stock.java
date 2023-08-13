
class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int profit = 0;
        int sp;
        int dayprofit;
        for(int i=1;i<prices.length;i++){
             sp=prices[i];
             dayprofit = sp - bp;
             
             if(profit<dayprofit){
                 profit = dayprofit;
             }
             if(bp>prices[i]){
                 bp=prices[i];
             }


        }
           return profit;

    }
}
