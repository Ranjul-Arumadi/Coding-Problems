/*
    link: https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
    
    Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 

    Example 1:

    Input: nums = [3,1,2,2,2,1,3], k = 2
    Output: 4
    Explanation:
    There are 4 pairs that meet all the requirements:
    - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
    - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
    - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
    - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
*/
class Solution {
    public int countPairs(int[] nums, int k) {
        int l = nums.length;
        int c=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if((nums[i]==nums[j]) && (i*j)%k==0){
                    c++;    
                }
            }
        }
        
        return c;
    }
}
