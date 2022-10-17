/*
  link: https://leetcode.com/problems/percentage-of-letter-in-string/
  
  Formula = (given*100) / total
  
  Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

 

  Example 1:

  Input: s = "foobar", letter = "o"
  Output: 33
  Explanation:
  The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
*/
class Solution {
    public int percentageLetter(String s, char letter) {
        int l = s.length();
        int count = 0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        int ans=0;
        ans = (count*100)/l;
        return ans;
    }
}
