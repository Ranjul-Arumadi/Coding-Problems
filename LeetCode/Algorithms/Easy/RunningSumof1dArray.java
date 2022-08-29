/*
  link: https://leetcode.com/problems/running-sum-of-1d-array/
  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

  Return the running sum of nums.



  Example 1:

  Input: nums = [1,2,3,4]
  Output: [1,3,6,10]
  Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int l = nums.length;
        int ans[] = new int[l];
        for(int i=0;i<l;i++){
            sum+=nums[i];
            ans[i] = sum;
        }
        
        return ans;
        
    }
}
