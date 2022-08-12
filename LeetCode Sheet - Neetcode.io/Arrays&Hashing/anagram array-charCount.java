/*
  Given two strings s and t, return true if t is an anagram of s, and false otherwise.

  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/
import java.util.*;
class anagram {
    static boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        
        if(l1!=l2){
            return false;
        }
        
        for(int i=0;i<l1;i++){
            hash1[s.charAt(i)- 'a']++;
            hash2[t.charAt(i)- 'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(hash1[i]-hash2[i]!=0){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String [] args){
		
		String s= "nl";
		String t= "cx";
		
		System.out.println(isAnagram(s,t));
	}
}
