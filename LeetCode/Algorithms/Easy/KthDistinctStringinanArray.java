/*
	link: https://leetcode.com/problems/kth-distinct-string-in-an-array/
	
	A distinct string is a string that is present only once in an array.

	Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

	Note that the strings are considered in the order in which they appear in the array.

	 

	Example 1:

	Input: arr = ["d","b","c","b","c","a"], k = 2
	Output: "a"
	Explanation:
	The only distinct strings in arr are "d" and "a".
	"d" appears 1st, so it is the 1st distinct string.
	"a" appears 2nd, so it is the 2nd distinct string.
	Since k == 2, "a" is returned. 
*/
import java.util.*;
class KthDistinctStringinanArray{
    public static void main(String [] args){
		int k=2;
		String arr[] = {"d","b","c","b","c","a"};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
            String ans = "";
			
			for(String i : arr){
				if(!hm.containsKey(i)){
                    hm.put(i, 1);
                }
                else{
                    hm.put(i, hm.get(i)+1);
                }
			}

            int v=0;
            for(String i: arr){
				
                if(hm.get(i)==1){
                    k--;
                }
                if(k==0){
                    System.out.println("k=0   "+k);
					ans = i;
                }
				System.out.println("K: "+i+ " V: "+ v);
            }
            System.out.println(ans);
    }
}
