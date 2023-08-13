lass Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
          int span[] = new int[n];
          Stack<Integer> sta = new Stack<>();
          
          span[0]=1;
          sta.push(0);
          for(int i=1;i<n;i++){
              int currPrice = price[i];
              
              while(!sta.isEmpty() && currPrice > price[sta.peek()]){
                  sta.pop();
              }
              if(sta.isEmpty())  span[i]=i+1;
              
              else{
                  int preHigh = sta.peek();
                  span[i]=i-preHigh;
              }
              
              sta.push(i);
          }
           return span;
    }
    
}
