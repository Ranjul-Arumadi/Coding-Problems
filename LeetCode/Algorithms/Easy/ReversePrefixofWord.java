/*
  link: https://leetcode.com/problems/reverse-prefix-of-word/
  
  Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

  For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
  Return the resulting string.



  Example 1:

  Input: word = "abcdefd", ch = "d"
  Output: "dcbaefd"
  Explanation: The first occurrence of "d" is at index 3. 
  Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

*/
class Solution {
    public String reversePrefix(String word, char ch) {
        int l = word.length();
        int indx = -1;
        for(int i=0;i<l;i++){
            if(word.charAt(i)==ch){
                indx=i;
                break;
            }
        }
        
        String temp = "";
        if(indx==-1){
            return word;
        }
        else{
            for(int i=indx;i>=0;i--){
                temp+=word.charAt(i);
            }
            for(int i=indx+1;i<l;i++){
                temp+=word.charAt(i);
            }
        }
        return temp;
    }
}
