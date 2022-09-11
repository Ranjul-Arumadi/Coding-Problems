/*
	link:https://leetcode.com/problems/determine-if-string-halves-are-alike/
	
	You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

	Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

	Return true if a and b are alike. Otherwise, return false.

	 

	Example 1:

	Input: s = "book"
	Output: true
	Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
*/

//Works if string only has LOWER CASE letters 
import java.util.*;
class DetermineifStringHalvesAreAlike{
    public static void main(String [] args){
        
		String s = "book";
		int l = s.length();
        int mid = l/2;
        
        String s2 = s.toLowerCase(); 
        System.out.println();
        int vowels1[] = new int[26];
        int vowels2[] = new int[26];
        
        
        char x = ' ';
        int asc = 0;
        
        for(int i=0;i<mid;i++){
            x = s2.charAt(i);
            asc = (int)x;
            vowels1[asc-97]++;
        }
        
        for(int i=mid;i<l;i++){
            x = s2.charAt(i);
            asc = (int)x;
            vowels2[asc-97]++;
        }
        /*
            ASCII
            
            lower case:
            
            a = 97 - 97 = 0
            e = 101- 97 = 4
            i = 105 -97 = 8
            0 = 111 -97 = 14
            u = 117 -97 = 20
        */
        for(int i=0;i<21 ;i++){
            if(i==4||i==8||i==14||i==20||i==0){
				if(vowels1[i]!=vowels2[i]){
					System.out.println("false");
				}
                
            }
			
			
        }
        
        System.out.println("true");
    }
}

// Mixed case string
/*

  Keep the vowels lower and upper in an array
  Keep 2 counters
  Run c1 from start to mid
  Run c2 from end to mid
  
  Increment upon condition satisy
  
  If counters are equal then string halves are equal, otherwise no.
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        int mid = l/2;
		
		int c1=0,c2=0;
        
        char arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		char x = ' ',y=' ';
		
		for(int i=0,j=l-1;i<j;i++,j--){
			x = s.charAt(i);
			y = s.charAt(j);
			for(int k=0;k<arr.length;k++){
				if(arr[k]==x){
					c1++;
				}
				if(arr[k]==y){
					c2++;
				}
			}
		}
		
		if(c1==c2){
			return true;
		}
		else{
			return false;
		}
    }
}
