/*

A family is about to break their piggy bank to use the money for different purposes. The piggy bank here 
represents an array (arr[]) consisting of N coins. The family has to split the coins of piggy bank into smaller 
stack (sub-array) of coins such that the sum of the difference between the maximum value and the minimum 
value of the coins for all the stacks (sub-arrays) is maximum.
Note: Each value of the array can be used only once that is only in one subarray
*/

import java.util.*;
class piggyBank{
    public static void main(String [] args){
        int arr[] = {8,1,7,9,2};
		
		int l = arr.length;
		
		// for max difference we can diff min and max values of sorted array
		Arrays.sort(arr);
		int sum=0;
		for(int i=0, j=l-1 ;i<l/2;i++,j--){
			sum+=(arr[j]-arr[i]);
		}
		System.out.println(sum);
    }
}
