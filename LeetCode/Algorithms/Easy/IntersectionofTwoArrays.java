/*
  link: https://leetcode.com/problems/intersection-of-two-arrays/
  
  Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

  Example 1:

  Input: nums1 = [1,2,2,1], nums2 = [2,2]
  Output: [2]
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        int l1 = nums1.length;
        int l2 = nums2.length;
       
        HashSet<Integer> s = new HashSet<Integer>();
       
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(nums1[i]==nums2[j]){
                    s.add(nums1[i]);
                }
            }
        }
       
        int l = s.size();
        int ans[] = new int[l];
        int pos = 0;
        for(Integer x: s){
            ans[pos++] = x;
        }
       
        return ans;
    }
}
