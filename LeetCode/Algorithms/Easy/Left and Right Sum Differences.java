/*
Link: https://leetcode.com/problems/left-and-right-sum-differences/submissions/982834854/
Time complexity: O(n^2)
*/
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];
        int left=0, right=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                left+=nums[j];
            }
            for(int k=nums.length-1;k>i;k--){
                right+=nums[k];
            }
            ans[i] = Math.abs(left-right);
            left=0;
            right=0;
        }

        return ans;
    }
}
/* 0(n) approach. Maintain 2 arrays for left, right sums and use a third array to find differences
    // 10, 4, 8, 3
    // -  10 14 22 L
    // 15 11 3  -  R
    // 15 1 11 22 Differences
*/

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        
        for(int i=1; i<n; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
        rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}
