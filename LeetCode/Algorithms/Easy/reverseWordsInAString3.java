/*
	link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
*/

import java.util.*;
class reverseWordsInAString3{
    public static void main(String [] args){
        String s = "Let's take LeetCode contest";
		
		String a[] = s.split(" ");
		int l = a.length;
		String ans = "";
		String word = "";
		int wl = 0;
		
		for(int i=0;i<l;i++){
			word = a[i];
			wl = word.length();
			
			for(int j=wl-1;j>=0;j--){
				ans+=word.charAt(j);
			}
			ans+=" ";
		}
		
		ans.trim();
		System.out.println(ans);
    }
}
