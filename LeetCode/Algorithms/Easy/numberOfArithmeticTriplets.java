/*
	link:https://leetcode.com/problems/number-of-arithmetic-triplets/
	
	You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

	i < j < k,
	nums[j] - nums[i] == diff, and
	nums[k] - nums[j] == diff.
	Return the number of unique arithmetic triplets.

	 

	Example 1:

	Input: nums = [0,1,4,6,7,10], diff = 3
	Output: 2
	Explanation:
	(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
	(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 
	
*/

import java.util.*;
class numberOfArithmeticTriplets{
    public static void main(String [] args){
		
		int nums[] = {0,1,4,6,7,10};
		int diff = 3;
		
		int ln = nums.length;
		int c = 0;
		
		/*
			i j k
			a b c
			j-i = diff
			k-j = diff
		*/
		
		for(int i=0;i<ln;i++){
			for(int j=i+1;j<ln;j++){
				for(int k=j+1;k<ln;k++){
					if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
						c++;
					}
				}
			}
		}
			
	
		
		System.out.println(c);
		
    }
}
