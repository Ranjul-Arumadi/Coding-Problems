/*
  link: https://leetcode.com/problems/two-sum/
  
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

  You may assume that each input would have exactly one solution, and you may not use the same element twice.

  You can return the answer in any order.



  Example 1:

  Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int val=0;
        int differenceNeeded=0;
        int ans[] = {0,0};
        
        for(int i=0;i<nums.length;i++){
            
            val = nums[i];
            differenceNeeded = (target - val);
            
            if(hm.containsKey(differenceNeeded)){
                ans[0] = hm.get(differenceNeeded);
                ans[1] = i;
                return ans;
                
            }
            else{
                hm.put(val, i);
            }
        }
        
        return ans;
    }
}
