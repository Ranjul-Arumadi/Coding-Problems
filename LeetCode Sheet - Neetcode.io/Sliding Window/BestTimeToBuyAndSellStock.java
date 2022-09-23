/*
  You are given an array prices where prices[i] is the price of a given stock on the ith day.

  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

  Example 1:
  Input: prices = [7,1,5,3,6,4]
  Output: 5
  Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
  Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        int l = 0, r = 1;
        int maxP = 0, p = 0;

        // l = buy | r = sell
        // buy low and sell high
        // update l only if r<l

        while (r < len) { // r should stay within the prices list

            // ideal case first
            if (prices[l] < prices[r]) {
                p = prices[r] - prices[l];
                maxP = Math.max(p, maxP);
            }
            /* 
            	at this case we have to move r and l
            	
            	- r will be incremented by 1 only at every iteration
            	- l only has to be changed if p[l]>p[p0] ie only when we buy high and sell low
            	  ,at this case we have to know that the low value was fixed in good terms(ie we wud have got
            	  a r-l as good profit). So set the l index to the previous r index.
            */
            else {
                l = r;
            }

            r += 1;
        }

        return maxP;


    }

}
