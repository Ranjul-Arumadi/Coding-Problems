/*
    link: https://leetcode.com/problems/keep-multiplying-found-values-by-two/
    
    trick is to use do while loop in a clever way.
*/
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int l = nums.length;
        int f = 1;
        int t = original;
        
        do{
            f=1;
            for(int i=0;i<l;i++){
                if(original==nums[i]){
                    original = original * 2;
                    f=0;
                }
            }
            
        }while(f!=1);
        
        
        return original;
        
    }
}
