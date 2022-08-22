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
import java.util.*;
class bestTimeBuySellStock{
    public static void main(String [] args){
		
        int prices[] = {7,6,4,3,1};//{7,1,5,3,6,4};
		
		int len = prices.length;
		
		int ans[][] = new int[3][20];
		
		//Arrays.fill(ans, -1);
		
		int buy=0, sell=0;
		int temp=0;
		int max=0;
		int index=0;
		
		for(int i=0;i<len;i++){
			
			int buyIndex=-1, sellIndex=-1;
			buy = prices[i];
			
			for(int j=i+1;j<len;j++){
				
			
				temp = prices[j]-buy;
				if(temp>max){
					max = prices[j]-buy;
					buyIndex=i;
					sellIndex=j;
				}
				
			}
			ans[0][index] = buyIndex;
			ans[1][index] = sellIndex;
			ans[2][index] = max;
			
			index++;
		}
		
		//get max
		int high=Integer.MIN_VALUE;
		int a=0,b=0;
		for(int i=0;i<20;i++){
			if(ans[2][i]>high){
				high = ans[2][i];
				a = ans[0][i];
				b = ans[1][i];
			}
		}
		
		for(int i=0;i<20;i++){
			//System.out.println(ans[2][i]+" ");
		}
		
		System.out.println(high);
    }
}
