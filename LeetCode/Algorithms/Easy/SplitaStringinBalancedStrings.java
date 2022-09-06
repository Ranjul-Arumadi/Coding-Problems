/*
  link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
  
  Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

  Given a balanced string s, split it into some number of substrings such that:

  Each substring is balanced.
  Return the maximum number of balanced strings you can obtain.



  Example 1:

  Input: s = "RLRRLLRLRL"
  Output: 4
  Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
*/

class Solution {
    public int balancedStringSplit(String s) {
        int len = s.length();
        
        int r=0,l=0;
        int count=0;
        char x=' ';
        for(int i=0;i<len;i++){
            x = s.charAt(i);
            if(x=='R'){
                r++;
            }
            else if(x=='L'){
                l++;
            }
            
            if(r==l){
                count++;
                r=0;
                l=0;
            }
        }
        
        return count;
    }
}
