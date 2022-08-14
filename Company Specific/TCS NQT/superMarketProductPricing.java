/*
	Q1. A supermarket maintains a pricing format for all its products. A value N printed on each product. When 
	the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. 
	The task is to design a software such that given the code of any item N the product(multiplication) of all the 
	digits of value should be computed(price).
	Example 1:
	Input:
	5244 -->Value of N
	Output:
	160 -->Price
	Explanation:
	From the input above:
	Product of the digits: 5,1,4,4
	5*2*4*4 = 160
	Hence Output is 160
*/
import java.util.*;
class superMarketProductPricing{
    public static void main(String [] args){
        int price=5244;
		int digit = 0;
		int val=1;
		while(price>0){
			digit = price%10;
			price/=10;
			val*=digit;
		}
		
		System.out.println("Price: "+val);
    }
}
