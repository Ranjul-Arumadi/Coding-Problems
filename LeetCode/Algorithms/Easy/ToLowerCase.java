/*
  link: https://leetcode.com/problems/to-lower-case/
  
  Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"

*/
class Solution {
    public String toLowerCase(String s) {
        int l = s.length();
        /*
            A  = 65
            a  = 97

            26 alphabets in total, so 65+26-1 and 97+26-1

            diff between lower and upper is 32
        */
        
        char x = ' ';
        int alpha = 0;
        String ans="";
        for(int i=0;i<l;i++){
            x = s.charAt(i);
            alpha  = (int)x;
            if(alpha>=65 && alpha<=90){
                alpha+=32;
                x = (char)alpha;
                ans+=x;
            }
            else{
                ans+=x;
            }
        }
        
        return ans;
    }
}
