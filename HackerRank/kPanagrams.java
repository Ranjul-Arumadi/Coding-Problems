/*
Given a string str and an integer K, find whether the string can be changed into a pangram after at most k operations. A pangram is a sentence containing every letter in the english alphabet. A single operation can be used to swap an existing alphabetic character with any other alphabetic character.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class kPanagrams{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String one = sc.nextLine();
		int k = sc.nextInt();
		
		//remove all whitespaces

		one = one.replaceAll(" ", "");

		
		int onelen = one.length();
		
		if(onelen<26){
			System.out.println("not");
			return;
		}
		
		/*
		Simpler method thatn using hashmap is by using a hash array
		- make int array X of size = 26 [26 alphabets in english]
		- incerment it as x[string.charAt(i) - 'a']++
		
		NOTE:
		
		Doing  " -'a' " gets the ascii value 
		*/
		
		int arr1[] = new int[26];
		
		//update values of first string
		for(int i=0;i<onelen;i++){
			arr1[one.charAt(i) - 'a']++;
		}
		
		//checking
		int issue=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==0){
				issue++;
			}
		}


		
		if((k-issue)>=0){
			System.out.println("KPanagram");
		}
		else{
			System.out.println("Not");
		}
		
	}
}

