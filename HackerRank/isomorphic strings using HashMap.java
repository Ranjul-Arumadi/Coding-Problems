/*
ISOMORPHIC

Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to the same character in ‘str2’.

Solved using HashMap:
----------------------

Important syntax and methods:
	- import java.util.*; [java.util.HashMap]
	- Declare = HashMap<key datatype, value datatype> hmapName = new HashMap<k dtype, v dtype>;
	
	Methods:
		Assume ht is name of HashMap
		- ht.containsKey(key) = check if a key is already present
		- ht.get(key) = returns the value associated with the key
		- ht.put(key, value) = enters the key, value into the map 
*/
import java.util.*;
class isomorphic{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int l1 =a.length(), l2 =b.length();
		if(l1!=l2){
			System.out.println("Not Isomorphic");
			return;
		}
		
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		char k = ' ', v = ' ';
		
		for(int i=0;i<l1;i++){
			k = a.charAt(i);
			v = b.charAt(i);
			if(hm.containsKey(k)){
				if(hm.get(k)!=v){
					System.out.println("Not Isomorphic");
					return;
				}
			}
			else{
				hm.put(k,v);
			}
		}
		System.out.println("Isomorphic");
		
	}
}
