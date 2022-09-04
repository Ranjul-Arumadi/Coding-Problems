/*
	link: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
  
  You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and 
	
	all the digits found in num must be used.

	For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
	Return the minimum possible sum of new1 and new2.

	 

	Example 1:

	Input: num = 2932
	Output: 52
	Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
	The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
*/


import java.util.*;
class MinimumSumofFourDigitNumberAfterSplittingDigits{
    public static void main(String [] args){
        int num = 2932;
		
		String s = Integer.toString(num);
		int l = s.length();
		
		int arr[] = new int[l];
		int digit =0, i=0;
		
		while(num>0){
			digit = num%10;
			arr[i++] = digit;
			num/=10;
		}
		
		Arrays.sort(arr);
		
		int num1 = 0, num2 = 0;
		
		int num1zero = arr[2];
		int num1tens = arr[0];
		
		int num2zero = arr[3];
		int num2tens = arr[1];
		
		num1 = num1tens*10 + num1zero;
		num2 = num2tens*10 + num2zero;
		
		System.out.println(num1+num2);
		
    }
}
