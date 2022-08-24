/*
	Bruteforce approach
*/
import java.util.*;
class longestValidParenthesis{
	
	static boolean open(char x){
		if(x=='('){
			return true;
		}
		else{
			return false;
		}
	}
	
	static boolean close(char x){
		if(x==')'){
			return true;
		}
		else{
			return false;
		}
	}
	
	static int lvp(String s){
		int mlen =0, max=0;
		Stack<Character> st = new Stack<Character>();
		int l = s.length();
		if(l<2){
			return 0;
		}
		char x = ' ';
		for(int i=0;i<l;i++){
			for(int j=i+2;j<l;j++){
				for(int k=i;k<=j;k++){
					x = s.charAt(k);
					if(open(x)){
						st.push(x);
					}
					else{
						if(st.empty()){
							break;
						}
						else if(!close(x)){
							break;
						}
						else{
							st.pop();
							mlen+=2;
							max=Math.max(mlen,max);
						}
						
					}
				}
				mlen=0;
			}
		}
		
		return max;
	}
    public static void main(String [] args){
        String s= ")()())";
		System.out.println(lvp(s));
    }
}
