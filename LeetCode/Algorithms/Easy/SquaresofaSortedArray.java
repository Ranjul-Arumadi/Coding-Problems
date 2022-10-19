/*
    link: https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
    
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



    Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
*/
/*
    link: https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
    
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



    Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
            Solve by using 2 pointers, that point at the extremes.
            compare abs value of both and decrement accordingly
            since we need increasing array append to the end of the answer array
            
            Use Math.abs() to get absolute value
        */
        
        int l = nums.length;
        
        int ans[] = new int[l];
        
        int j = l-1;
        int k= 0;
        int pos = l-1;
        
        for(int i=0;i<l;i++){
            if(Math.abs(nums[k])>Math.abs(nums[j])){
                ans[pos--] = nums[k] * nums[k];
                k++;
            }
            else{
                ans[pos--] = nums[j] * nums[j];
                j--;
            }
        }
        
        return ans;
    }
}
}
