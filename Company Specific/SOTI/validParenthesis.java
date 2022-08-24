/*
	- if opening brace, push
	- if empty while in loop -return false
	- if closing brace; check if it matches with the peek() value eg: { for } etc
	
	- after loop; 
		if loop empty - return true, else return false
*/
import java.util.*;
class validParenthesis{
	
	static boolean opening(char x){
		if(x=='{' || x=='(' || x=='['){
			return true;
		}
		else{
			return false;
		}
	}
	
	static boolean checkMatch(char curr, char prev){
		if(curr=='}' && prev=='{' || curr==')' && prev=='(' || curr==']' && prev=='['){
			return true;
		}
		else{
			return false;
		}
	}
	
	static boolean vp(String in){
		
		Stack<Character> s = new Stack<Character>();
		
		char x = ' ';
		if(in.length()<2){
			return false;
		}
		for(int i=0;i<in.length();i++){
			x = in.charAt(i);
			if(opening(x)){
				s.push(x);
			}
			else{
				if(s.empty()){
					return false;
				}
				else if(!checkMatch(x, s.peek())){
					return false;
				}
				//braces match
				else{
					s.pop();
				}
			}
		}
	
		if(s.empty()){
			return true;
		}
		else{
			return false;
		}
	}
    public static void main(String [] args){
        System.out.println(vp("{"));
    }
}
