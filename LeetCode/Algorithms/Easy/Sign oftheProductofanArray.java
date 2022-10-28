/*
  link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
  
  There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

 

Example 1:

Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1
*/

class Solution {
    public int arraySign(int[] nums) {
        int l = nums.length;
        int p = 1;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                p=0;
                break;
            }
            else if(nums[i]>0){
                p*=1;
            }
            else{
                p*=-1;
            }
        }
       
        //System.out.println(p);
       
        if(p>0){
           return 1;
        }
        else if(p<0){
            return -1;
        }
       
        return 0;
    }
}
