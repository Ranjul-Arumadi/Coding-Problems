/*
  link: https://leetcode.com/problems/merge-strings-alternately/
  
  You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

  Return the merged string.



  Example 1:

  Input: word1 = "abc", word2 = "pqr"
  Output: "apbqcr"
  Explanation: The merged string will be merged as so:
  word1:  a   b   c
  word2:    p   q   r
  merged: a p b q c r
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        
        int max = Math.max(l1,l2);
        
        int i=0,j=0;
        String ans="";
        while(i<l1 && j<l2){
            ans+=word1.charAt(i);
            i++;
            ans+=word2.charAt(j);
            j++;
        }
        
        if(l1>l2){
            ans+=word1.substring(i, l1);
        }
        else{
            ans+=word2.substring(j, l2);
        }
        
        return ans;
    }
}
