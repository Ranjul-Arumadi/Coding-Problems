/*
    link: https://leetcode.com/problems/unique-morse-code-words/submissions/
    
    HashSet can be used to store non-duplicate values
    
    nternational Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

    'a' maps to ".-",
    'b' maps to "-...",
    'c' maps to "-.-.", and so on.
    For convenience, the full table for the 26 letters of the English alphabet is given below:

    [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

    For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
    Return the number of different transformations among all words we have.



    Example 1:

    Input: words = ["gin","zen","gig","msg"]
    Output: 2
    Explanation: The transformation of each word is:
    "gin" -> "--...-."
    "zen" -> "--...-."
    "gig" -> "--...--."
    "msg" -> "--...--."
    There are 2 different transformations: "--...-." and "--...--.".
*/
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String a[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    HashMap<Character, String> hm = new HashMap<Character, String>();
    char letter = 'a';
    
    for(int i=0;i<26;i++){
        hm.put(letter++, a[i]);
    }
    
    int l = words.length;
    String ans[] = new String[l];
    String temp = "";
    int pos = 0;
        
    int wl = 0;
    for(int i=0;i<l;i++){
        wl = words[i].length();
        for(int j=0;j<wl;j++){
            temp+=hm.get(words[i].charAt(j));
        }
        ans[pos++] = temp;
        temp="";
        
    }
        
        Set<String> set =  new HashSet<String>();
        for(int i=0;i<ans.length;i++){
            set.add(ans[i]);
        }
        
        int listsize = set.size();
        
        return listsize;
        
    
    }
}
