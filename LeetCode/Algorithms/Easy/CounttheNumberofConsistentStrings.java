/*
    link: https://leetcode.com/problems/count-the-number-of-consistent-strings/
    
    using set can get search time to O(1). 
    Use character array and .contains() method for better processing
    
    You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

    Return the number of consistent strings in the array words.



    Example 1:

    Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
    Output: 2
    Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
    
*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<Character>();
        
        for(Character c:allowed.toCharArray()){
            set.add(c);
        }
        
        int l = words.length;
        int wl =0;
        int f=0;
        int c=0;
        
        for(int i=0;i<l;i++){
            wl = words[i].length();
            for(int j=0;j<wl;j++){
                if( !set.contains(words[i].charAt(j)) ){
                    f=1;
                    break;
                }
            }
            if(f==0){
                c++;
            }
            f=0;
        }
        
        return c;
    }
}
