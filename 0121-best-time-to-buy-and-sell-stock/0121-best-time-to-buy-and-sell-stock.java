class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // If we find a lower price, update our buy price
            if (price < minPrice) {
                minPrice = price;
            } 
            // Otherwise, check if selling at the current price yields a better profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}