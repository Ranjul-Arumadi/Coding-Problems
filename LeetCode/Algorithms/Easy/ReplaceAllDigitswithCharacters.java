/*
	link: https://leetcode.com/problems/replace-all-digits-with-characters/
	
	Easier method:
	
	char to int
	-----------
	
	char a = '1';
	int num = a - '0'; // we get the numeric value 1
	
	to ascii
	--------
	
	char letter = 'a';
	int ascii = letter; //ascii of 'a' gets stored
	
	ascii to char
	-------------
	
	char letterFromAscii = (char)(ASCIINUMERICVALUE);
*/
import java.util.*;
class ReplaceAllDigitswithCharacters{
    public static void main(String [] args){
        
		String s = "a1b2c3d4e";
		
		int l = s.length();
		int end = l;
		if(l%2!=0){
			end = l-2;
		}
		
		char letter = ' ';
		char number = ' ';
		String t = "";
		int shift =0;
		int letterAscii = 0;
		String ans = "";
		char newletter = ' ';
		
		for(int i=0;i<end;i=i+2){
			letter = s.charAt(i);
			number = s.charAt(i+1);
			
			t = String.valueOf(number);
			shift = Integer.parseInt(t);
			
			letterAscii = (int)letter;
			newletter = (char)(shift+letterAscii);
			
			ans+=letter;
			ans+=newletter;
			
		}
		if(l%2!=0){
			ans+=s.charAt(l-1);
		}
		System.out.println(ans);
    }
}
