/*
  link: https://leetcode.com/problems/reverse-words-in-a-string/description/
  
  Given an input string s, reverse the order of the words.

  A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

  Return a string of the words in reverse order concatenated by a single space.

  Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



  Example 1:

  Input: s = "the sky is blue"
  Output: "blue is sky the"
  
  Important Note:
  ---------------
   + .split(" ") will split the string by single space only.
   + If string has multiple spaces then this will not work.

   + Regex for space is \s ...so escape \ with \\s. Now we need 1 or more space, so use \\s+, since + is 1 or more and * is 0 or more.
*/

class Solution {
    public String reverseWords(String s) {
        String a = s.trim();
        String arr[] = a.split("\\s+");
        int l = arr.length;
        String ans = " ";
        for(int i=l-1;i>=0;i--){
            ans+=arr[i];
            ans+=" ";
        }
        String f = ans.trim();
        return f;
    }
}
