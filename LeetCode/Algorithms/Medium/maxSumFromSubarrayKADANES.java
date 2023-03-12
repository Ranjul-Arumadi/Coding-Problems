/*
LINK: https://leetcode.com/problems/maximum-subarray/description/
*/

class Solution {
    public int maxSubArray(int[] nums) {
        

        // using kadanes algo for O(N)

        /**
            Working
            1. set max as the first value of the array
            2. set sum as 0
            3. iterate over the array values
                3.1 Add the values to the sum variable
                3.2 if sum<0 set sum =0
                3.3 if sum>max replace max with sum value
            4. max will have the answer
         */

        int max = nums[0];
        int sum = 0;
        /*if(nums.length==1){
            return max;
        }*/
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }

        return max;

    }
}
