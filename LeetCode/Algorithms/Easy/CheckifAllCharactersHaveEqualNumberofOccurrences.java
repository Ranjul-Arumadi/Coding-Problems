/*
	link:https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
	
	Given a string s, return true if s is a good string, or false otherwise.

	A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

	 

	Example 1:

	Input: s = "abacbc"
	Output: true
	Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
*/

import java.util.*;
class CheckifAllCharactersHaveEqualNumberofOccurrences{
    public static void main(String [] args){
        
		String s = "wzkpzzwzpzkwkpkppzkppkpkwwkzzzwwpwwk";
		int l = s.length();
        
        int a[] = new int[26];
        char x = ' ';
        int ltr = 0;
        for(int i=0;i<l;i++){
            x = s.charAt(i);
            ltr = (int)x;
            a[ltr-97]++;
        }
        int check= 0;
        
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                check = a[i];
                break;
            }
        }
        
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                if(a[i]!=check){
                    System.out.println("false");
                }
            }
        }
        
        System.out.println("true");
    }
}
