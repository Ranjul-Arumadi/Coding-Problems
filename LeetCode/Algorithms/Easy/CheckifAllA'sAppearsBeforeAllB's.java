/*
  link: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
  
  Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

 

  Example 1:

  Input: s = "aaabbb"
  Output: true
  Explanation:
  The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
  Hence, every 'a' appears before every 'b' and we return true.
*/

class Solution {
    public boolean checkString(String s) {
        int l = s.length();

        int bindex = -1;
        //find first b
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='b'){
                bindex = i;
                break;
            }
        }
        if(bindex==-1){
            return true;
        }
        // check if any a's after the first b
        boolean ans = true;
        try{
            for(int i = bindex+1; i<l;i++){
                if(s.charAt(i)=='a'){
                    ans  = false;
                    return ans;
                }
            }
        }
        catch(Exception e){
            
        }
        
        
        return ans;
        
    }
}
