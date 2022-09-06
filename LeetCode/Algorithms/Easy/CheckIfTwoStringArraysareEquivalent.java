/*
  link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
  
  Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

  A string is represented by an array if the array elements concatenated in order forms the string.



  Example 1:

  Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
  Output: true
  Explanation:
  word1 represents string "ab" + "c" -> "abc"
  word2 represents string "a" + "bc" -> "abc"
  The strings are the same, so return true.

*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int l1 = word1.length;
        int l2 = word2.length;
        
        String a = " ";
        String b = " ";
        
        for(int i=0;i<l1;i++){
            a+=word1[i];
        }
        
        for(int i=0;i<l2;i++){
            b+=word2[i];
        }
        
        int l3 = a.length();
        int l4 = b.length();
        
        if(l3!=l4){
            return false;
        }
        
        for(int i=0;i<l3;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
}
