/*
  link: https://leetcode.com/problems/count-prefixes-of-a-given-string/
  
  You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.

  Return the number of strings in words that are a prefix of s.

  A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.



  Example 1:

  Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
  Output: 3
  Explanation:
  The strings in words which are a prefix of s = "abc" are:
  "a", "ab", and "abc".
  Thus the number of strings in words which are a prefix of s is 3.
*/

class Solution {
    public int countPrefixes(String[] words, String s) {
        int l = s.length();
        String a[] = new String[l];
        String ans = "";
        int pos=0;
        int t=0;
        
        //find all prefixes
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                for(int k=i;k<=j;k++){
                    ans+=s.charAt(k);         
                }
                if(t==l){
                    break;
                }
                if(ans!=""){
                    a[pos++] = ans;
                    ans = "";
                    t++;
                }
            }
        }
        
        int c=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<l;j++){
                if(words[i].equals(a[j])){
                    c++;
                }
            }
        }
        
        return c;
        
    }
}
