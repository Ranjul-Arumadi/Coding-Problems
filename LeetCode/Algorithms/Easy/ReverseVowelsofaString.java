/*

  link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
  
  Given a string s, reverse only all the vowels in the string and return it.

  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



  Example 1:

  Input: s = "hello"
  Output: "holle"
  
  Approach:
  
  2 POINTER APPROACH
  
  - convert string to a character array
  - use two pinters to iterate from start and end
  - use hashset to check if vowel to improve the time complexity
  - if start and end var match for vowel swap the letters using a temp char variable
  - use loop to iterate over the character array to make a string
  - this is the required ans
*/

class Solution {
    public String reverseVowels(String s) {
        char a[] = s.toCharArray();

        int i=0, j=s.length()-1;

        HashSet<Character> hs = new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');

        int m=0,n=0;
        char t =' ';

        while(i<j){
            if(hs.contains(a[i])){
                m=1;
            }
            else{
                i++;
            }

            if(hs.contains(a[j])){
                n=1;
            }
            else{
                j--;
            }

            if(m==1 && n==1){
                t = a[i];
                a[i] = a[j];
                a[j] = t;

                m=0;
                n=0;
                i++;
                j--;
            }
        }
        String ans="";
        for(i=0;i<a.length;i++){
            ans+=a[i];
        }

        return ans;

    }
}
