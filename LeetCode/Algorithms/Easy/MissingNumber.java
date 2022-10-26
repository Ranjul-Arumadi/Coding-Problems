/*
    link: https://leetcode.com/problems/missing-number/submissions/
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

    Example 1:

    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
    
    Approach:
    --------
    
    - Find the sum of all array values.
    - Find sum of n values
    - Find difference
*/
class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int s = (l*(l+1))/2;
        int c =0;
        for(int x:nums){
            c+=x;
        }
        
        return s-c;
    }
}
