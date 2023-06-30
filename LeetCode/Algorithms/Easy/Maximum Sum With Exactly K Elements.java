/*
Link: https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/submissions/982928171/
*/

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>max){
                max = x;
            }
        }
        int sum=max;
        for(int i=1;i<k;i++){ //NOTE THE NUMBE OF ITERATIONS
            max++;
            sum+=max;
        }

        return sum;
    }
}
