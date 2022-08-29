/*
  link: https://leetcode.com/problems/shuffle-the-array/
  
  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

  Return the array in the form [x1,y1,x2,y2,...,xn,yn].



  Example 1:

  Input: nums = [2,5,1,3,4,7], n = 3
  Output: [2,3,5,4,1,7] 
  Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int ans[] = new int[l];
        /*int x=0;
            for(int i=0;i<n;i++){
                ans[x] = nums[i];
                x+=2;
            }
            x=1;
            for(int i=n;i<l;i++){
                ans[x] = nums[i];
                x+=2;
            }
        */
        for(int i=0,j=n, x=0;x<l;i++,j++){
            ans[x++] = nums[i]; 
            ans[x++] = nums[j];
        }
        return ans;
    }
}
