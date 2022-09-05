/*
	link:https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	
	There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

	Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

	Note that multiple kids can have the greatest number of candies.

	 

	Example 1:

	Input: candies = [2,3,5,1,3], extraCandies = 3
	Output: [true,true,true,false,true] 
	Explanation: If you give all extraCandies to:
	- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
	- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
	- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
	- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
	- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
*/

import java.util.*;
class kidsWiththeGreatestNumberofCandies{
	
	static boolean check(int copy[],int candies[], int i){
		for(int j=0;j<copy.length;j++){
			if(j==i){
				continue;
			}	
			if(candies[i]<copy[j]){
				return false;
			}
		}
		return true;
		
	}
    public static void main(String [] args){
        int candies[] = {2,3,5,1,3};
		int copy[] = candies.clone();
		// 5 6 8 4 6
		int extraCandies = 3;
		
		int l = candies.length;
		
		boolean ans[] = new boolean[l];
		
		for(int i=0;i<l;i++){
			candies[i]+=extraCandies;
			if(check(copy,candies, i)){
				ans[i] = true;
			}
			else{
				ans[i] = false;
			}
		}
		
		
		
		List<Boolean> a = new ArrayList<Boolean>();
		for(boolean x:ans){
			a.add(x);
		}
		
		System.out.println(a);
    }
}
