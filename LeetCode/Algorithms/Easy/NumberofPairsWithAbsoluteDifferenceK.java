/*
    link: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/
    
    Just bruteforce comparison O(n^2)
    Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

    The value of |x| is defined as:

    x if x >= 0.
    -x if x < 0.


    Example 1:

    Input: nums = [1,2,2,1], k = 1
    Output: 4
    Explanation: The pairs with an absolute difference of 1 are:
    - [1,2,2,1]
    - [1,2,2,1]
    - [1,2,2,1]
    - [1,2,2,1]

*/

class Solution {
    public int countKDifference(int[] nums, int k) {
        int l = nums.length;
        int c=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    c++;    
                }
            }
        }
        
        return c;
    }
}
