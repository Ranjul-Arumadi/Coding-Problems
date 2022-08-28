/*
  link: https://leetcode.com/problems/contains-duplicate/
  
  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

  Example 1:

  Input: nums = [1,2,3,1]
  Output: true
*/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        return false;
    }
}
