/*
  link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
  
  Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

  Example 1:

  Input: nums = [3,4,5,2]
  Output: 12 
  Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
*/
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int l = nums.length;
        
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if( (nums[i]-1) * (nums[j]-1) > max){
                    max = (nums[i]-1) * (nums[j]-1);
                }
            }
        }
        
        return max;
    }
}
