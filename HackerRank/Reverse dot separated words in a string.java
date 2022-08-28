import java.util.*;
/*
Given a String S, reverse the string without reversing its individual words. 
Words are separated by dots.
*/
class ReverseDotSeperatedWordsInAString{
	public static void main(String [] args){
		String str = "i.like.this.program.very.much";
        
		/*
		-Find the number of words in the string.
		-This can be done by making use of the dot in the string.
		-Append a dot to the end, this will be useful in the coming steps.
		*/
		int dot=0;
		str+='.';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='.'){
				dot++;
			}
		}
		
		/*
		- The required size will be 2*dot as we have appended the dot at the end. 
			Making the dot and word count same.
		- Create a new string array based on this size.
		*/
		int size = dot+(dot);
		String a[] = new String[size]; // dot + words = new arrat size
		
		
		
		/*
			Iterate through the string, and concat the char with a temporary string variable.
			On encountering dot add the temp string to the string array.
			Followed by this add the dot manually.
		*/
		String temp="";
		int pos=-1;
		String dott = ".";
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='.'){
				temp+=str.charAt(i);
			}
			else{
				a[++pos] = temp;
				a[++pos] = dott;
				temp = "";
			}
			
		}
		
		/*
			Reverse the words one by one (including the dots)
		*/
		// reverse
		temp = "";
		int end = size-1;
		for(int i=0;i<size/2;i++){
			temp = a[i];
			a[i] = a[end];
			a[end] = temp;
			end--;
		}
		
		/*
			Since a dot is present in the front, print from index 1
		*/
		// print
		for(int i=1;i<size;i++){
			System.out.print(a[i]);
		} 
        
	}
}
