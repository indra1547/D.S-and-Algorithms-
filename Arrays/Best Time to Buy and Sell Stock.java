/*121. Say you have an array for which the ith element is the price of a given stock on day i.If you were only permitted to complete at 
  most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
  Note that you cannot sell a stock before you buy one.*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
