/*
	link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
	
	Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

	Example 1:

	Input: n = 234
	Output: 15 
	Explanation: 
	Product of digits = 2 * 3 * 4 = 24 
	Sum of digits = 2 + 3 + 4 = 9 
	Result = 24 - 9 = 15
*/

import java.util.*;
class SubtracttheProductandSumofDigitsofanInteger{
    public static void main(String [] args){
        int n = 234;
		int sum=0, prod=1;
		int digit = 0;
		while(n>0){
			digit = n%10;
			sum+=digit;
			prod*=digit;
			n/=10;
		}
		
		System.out.println(prod-sum);
    }
}
