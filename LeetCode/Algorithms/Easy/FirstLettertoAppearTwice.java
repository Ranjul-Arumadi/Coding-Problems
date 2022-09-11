/*
	link:https://leetcode.com/problems/first-letter-to-appear-twice/
	
	Given a string s consisting of lowercase English letters, return the first letter to appear twice.

	Note:

	A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
	s will contain at least one letter that appears twice.
	 

	Example 1:

	Input: s = "abccbaacz"
	Output: "c"
	Explanation:
	The letter 'a' appears on the indexes 0, 5 and 6.
	The letter 'b' appears on the indexes 1 and 4.
	The letter 'c' appears on the indexes 2, 3 and 7.
	The letter 'z' appears on the index 8.
	The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
*/

import java.util.*;
class FirstLettertoAppearTwice{
    public static void main(String [] args){
        String s = "abccbaacz";
		int l = s.length();
        int ltrs[] = new int[26];
        char x = ' ';
        int asc = 0;
		
        for(int i=0;i<l;i++){
			
            x = s.charAt(i);
            asc = (int)x;
			ltrs[asc-97]++;
            if(ltrs[asc-97]>1){
				break;
            }
            
            
            
			
			//System.out.println("char= "+x+" ascii: "+(asc-97)+" val: "+ltrs[asc-97]);
            
        }
        
        System.out.println(x);;
    }
}
