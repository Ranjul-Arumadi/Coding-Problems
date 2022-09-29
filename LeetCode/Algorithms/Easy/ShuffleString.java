/*
  link: https://leetcode.com/problems/shuffle-string/
  
  You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

  Return the shuffled string.



  Example 1:


  Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
  Output: "leetcode"
  Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/

class Solution {
    public String restoreString(String s, int[] indices) {
        int l = s.length();
        
        char a[] = new char[l];
        
        a = s.toCharArray();
        
        char b[] = new char[l];
        
        for(int i=0;i<indices.length;i++){
            b[indices[i]] = a[i];
        }
        
        String ans = String.valueOf(b);
        
        return ans;
    }
}
