/*
    link: https://leetcode.com/problems/sum-of-unique-elements/
    
    Only iterate with for(Integer x: hm.keySet()) while taking sum to avoid duplicating.
    You are given an integer array nums. The unique elements of an array are the elements     that appear exactly once in the array.

     Return the sum of all the unique elements of nums.

 

    Example 1:

    Input: nums = [1,2,3,2]
    Output: 4
    Explanation: The unique elements are [1,3], and the sum is 4.
    
*/
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int l = nums.length;
        
        for(int i=0;i<l;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        
        int s = 0;
        for(Integer x: hm.keySet()){
            if(hm.get(x)==1){
                s+=x;
            }
        }
        
        return s;
    }
}
