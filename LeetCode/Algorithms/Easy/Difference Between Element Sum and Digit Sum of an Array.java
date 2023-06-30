/*
Link: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/submissions/982923105/
*/
class Solution {
    public int differenceOfSum(int[] nums) {
        int arraySum=0, digitSum=0;
	    for(int i=0;i<nums.length;i++){
            arraySum+=nums[i];
            int val = nums[i];
            while(val>0){
                digitSum+=val%10;
                val/=10;
            }
        }

        int ans =  Math.abs(arraySum-digitSum);
        return ans;
    }
}
