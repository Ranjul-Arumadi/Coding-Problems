/*
Longest common prefix | Word by word matching
*/
import java.util.*;
class longestCommonPrefix{
	
	/*
		- Get length of both strings
		- loop from i,j 0 to sizes of arrays
		- if the value dont match break
		- else update the reult variable with the characters
		- return the result variable
		
		IMPORTANT
		- the common function will recieve this and update its prefix value and second string value 
		 and the process is repeated untill all the values are covered, before resutring the final ans to
		 main function
	*/
	static String check(String s1, String s2){
		int s1len  = s1.length();
		int s2len  = s2.length();
		
		String result = "";
		for(int i=0, j=0;i<=s1len-1 && j<=s2len-1;i++,j++){
			if(s1.charAt(i)!=s2.charAt(j)){
				break;
			}
			result+=s1.charAt(i);
		}
		return result;
	}
	/*
		- This function accepts the string array
		- set prefix = first array value
		- loop from ! 1 ! to ! <=arraysize-1 ! so as to cover all the array values
 		- pass the prefix and array value from index ! 1 ! to another function say check
		- The following is IMPORTANT 
		the returning value is stored in same variable named prefix
		- outside loop prefix is returned from the function
	*/
	static String common(String arr[]){
		int size = arr.length;
		
		// initial compare value
		String prefix = arr[0];
		
		// <=size-1 to go till and incl the last index item
		for(int i=1;i<=size-1;i++){
			prefix = check(prefix, arr[i]);
		}
		
		return prefix;
	}
	/*
		Main function:
		
		- Read the array values from the user and store to a string array
		- Pass the array to a function say check
		- the returning value from this function will be the final ans.
		- Only if the returning value size is >0 can we say a common prefix exist
	*/
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size=0;
		size = sc.nextInt();
		
		String arr[] = new String[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.next();
		}
		
		String ans = common(arr);
		if(ans.length()>0){
			System.out.println("Longest common prefix: "+ ans);
		}
		else{
			System.out.println("No common prefix");
		}
		
		
	}
}
