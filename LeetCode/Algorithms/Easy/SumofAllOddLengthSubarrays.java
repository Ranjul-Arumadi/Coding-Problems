/*
	link:https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
	
	Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

	A subarray is a contiguous subsequence of the array.

	 

	Example 1:

	Input: arr = [1,4,2,5,3]
	Output: 58
	Explanation: The odd-length subarrays of arr and their sums are:
	[1] = 1
	[4] = 4
	[2] = 2
	[5] = 5
	[3] = 3
	[1,4,2] = 7
	[4,2,5] = 11
	[2,5,3] = 10
	[1,4,2,5,3] = 15
	If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/

import java.util.*;
class SumofAllOddLengthSubarrays{
    public static void main(String [] args){
        int arr[] = {1,4,2,5,3};
		int l =arr.length;
		int lsum=0, gsum=0;
		for(int i=0;i<l;i++){
			for(int j=i;j<l;j++){
				for(int k=i;k<=j;k++){
					if((j-i)%2==0){
						lsum+=arr[k];
					}
					
				}
				gsum+=lsum;
				lsum=0;
			}
		}
		
		System.out.println(gsum);
    }
}
