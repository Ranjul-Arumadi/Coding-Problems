/*
  Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

  You must write an algorithm with O(log n) runtime complexity.



  Example 1:

  Input: nums = [-1,0,3,5,9,12], target = 9
  Output: 4
  Explanation: 9 exists in nums and its index is 4
*/

class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        
        int s=0, e = l-1, m=0;
        int f=0;
        int i=0;
        
        for(i=0;i<l;i++){
            m = (s+e)/2;
            if(target == nums[m]){
                f=1;
                break;
            }
            else if(target < nums[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        if(f==1){
            return m;
        }
        
        return -1;
        
    }
}
