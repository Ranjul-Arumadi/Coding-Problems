/*
	link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
	
	A pangram is a sentence where every letter of the English alphabet appears at least once.

	Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

	 

	Example 1:

	Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
	Output: true
	Explanation: sentence contains at least one of every letter of the English alphabet.
*/
class Solution {
    public boolean checkIfPangram(String sentence) {
        int l = sentence.length();
        if(l<26){
            return false;
        }
        char x = ' ';
        int val = 0;
        int a[] = new int[26];
        
        for(int i=0;i<l;i++){
            x = sentence.charAt(i);
            val = x;
            // a ASCII = 97
            a[val-97]++;
        }
        
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                return false;
            }
        }
        
        return true;
    }
}
