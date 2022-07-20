import java.util.*;
/*
Given a String S, reverse the string without reversing its individual words. 
Words are separated by dots.
*/
class revWordsInAString{
	public static void main(String [] args){
		String str = "i.like.this.program.very.much";
        
		//length
		int dot=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='.'){
				dot++;
			}
		}
		String a[] = new String[dot+1];
		String temp="";
		int pos=0;
		
		str+='.';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='.'){
				temp+=str.charAt(i);
			}
			else{
				a[pos++] = temp;
				temp = "";
			}
			
		}
		
		
		// reverse
		int end = (a.length)-1;
		
		String hold = "";
		for(int i=0;i<(a.length)/2;i++){
			temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			end--;
		}
		
		for(String x: a){
			System.out.println(x);
		}
  
        
        
	}
}
