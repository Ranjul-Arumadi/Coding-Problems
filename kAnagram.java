/*
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram itself can be rearranged into nag a ram, also the word binary into brainy and the word adobe into abode.

------------------------------------------------------------

Given two strings of lowercase alphabets and a value K, your task is to complete the given function which tells if  two strings are K-anagrams of each other or not.

Two strings are called K-anagrams if both of the below conditions are true.
1. Both have same number of characters.
2. Two strings can become anagram by changing at most K characters in a string.

-------------------------------------------------------------

Input:  str1 = "anagram" , str2 = "grammar" , k = 3
Output:  Yes
Explanation: We can update maximum 3 values and 
it can be done in changing only 'r' to 'n' 
and 'm' to 'a' in str2.

Input:  str1 = "geeks", str2 = "eggkf", k = 1
Output:  No
Explanation: We can update or modify only 1 
value but there is a need of modifying 2 characters. 
i.e. g and f in str 2.
*/
import java.util.*;
import java.lang.*;
class kAnagram{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		String one = sc.next();
		String two = sc.next();
		int k = sc.nextInt();
		
		int onelen = one.length();
		int twolen = two.length();
		
		if(onelen!=twolen){
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
		int arr2[] = new int[26];
		
		//update values of first string
		for(int i=0;i<onelen;i++){
			arr1[one.charAt(i) - 'a']++;
		}
		//update values of second string
		for(int i=0;i<onelen;i++){
			arr2[two.charAt(i) - 'a']++;
		}
		
		
		//checking
		int issue=0;
		for(int i=0;i<arr1.length;i++){
			if(Math.abs(arr1[i]-arr2[i])>0){
				issue++;
			}
		}


		
		if((k-issue)>=0){
			System.out.println("KAnagram");
		}
		else{
			System.out.println("Not");
		}
		
	}
}

