/*
	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/

/*
	Approach:
	
	- We can eliminate space, non-alpa stuff from the string and store the cleaned string to new var
	- reverse the string
	- check if original string
	
	Constant space approach:
	
	- use two pointers, to point start++ and end-- and compare
	- own alpha-num checker can be made by using ascii values for comparison
*/
import java.util.*;
class validPalindrome{
	
	
	/*
	ASCII:
		- 0 to 9 => 48 to 57
		- A to Z => 65 to 90
		- a to z=> 97 to 122
	*/
	static boolean check(char x){
		int y = x; //to get ascii value
		
		if((y>=48 && y<=57) || (y>=65 && y<=90) || (y>=97 && y<=122)){
			return false;
		}
		return true;
	}
	
    public static void main(String [] args){
        //String s = "A man, a plan, a canal: Panama";
		String s = ".,";
		
		int len = s.length();
		char start=' ', end=' ';
		
		boolean ans = true;
		int flag=0;
		
		int i=0, j=len-1;
		while(i<j){
			
			
			
			
			do{
				start = s.charAt(i);
				ans = check(start);
				//true = not valid char
				if(ans && i<len-1){
					i++;
				}
				else{
					break;
				}
			}while(ans);
			
			do{
				end = s.charAt(j);
				ans = check(end);
				//true = not valid char
				if(ans && j>0){
					j--;
				}
				else{
					break;
				}
			}while(ans);
			
			
			
			
			
			start = s.charAt(i);
			end = s.charAt(j);
			
			if(i==len-1 && j==0){
				/*
					This is needed if input only has invalid chars, so length of string is 0 and so will be valid palindrome.
				*/
				flag=0;
				break;
			}
			
			
			if(Character.toLowerCase(start)!=Character.toLowerCase(end)){
				flag=1;
				break;
			}
			i++;
			j--;
		}
		
		if(flag==1){
			System.out.println("Not");
		}
		else{
			System.out.println("Yes");
		}
		
    }
}
