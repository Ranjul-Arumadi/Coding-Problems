/*
link: https://leetcode.com/problems/binary-search/
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
