 class Solution {
    public int maxProfit(int[] prices) {
    // 1st case for if stock price down day by day and no profit {6,5,4,3,2,1}
       int count = 0;
       for(int i=1;i<prices.length;i++){
           if(prices[i-1]>prices[i]){
               count++;
           }
       }
       if(count==prices.length-1){
           return 0;
       }
    // 2nd Case for count total profit 
       int totalProfit = 0;
        int profitOfDay = 0;
         for(int i=1;i<prices.length;i++){
             profitOfDay = prices[i]-prices[i-1]; //profitOfDay = sellingprice-buyingprices
             if(profitOfDay>0){
              totalProfit +=profitOfDay;
             }
           }
        return totalProfit;
    }
}
