/*
	
	link: https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
	
	You are given a 0-indexed string num of length n consisting of digits.

	Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

	 

	Example 1:

	Input: num = "1210"
	Output: true
	Explanation:
	num[0] = '1'. The digit 0 occurs once in num.
	num[1] = '2'. The digit 1 occurs twice in num.
	num[2] = '1'. The digit 2 occurs once in num.
	num[3] = '0'. The digit 3 occurs zero times in num.
	The condition holds true for every index in "1210", so return true.
*/
import java.util.*;
class CheckifNumberHasEqualDigitCountandDigitValue{
    public static void main(String [] args){
		
		String num = "030";
        int l = num.length();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int a = 0;
        
        // add to hashmap
        for(int i=0;i<l;i++){
            a = Integer.parseInt(String.valueOf(num.charAt(i)));
            System.out.print(a+" ");
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a)+1);
            }
            else{
                hm.put(a, 1);
            }
        }
        
        boolean ans = true;
        
        // check conditions
        for(int i=0;i<l;i++){
            a = Integer.parseInt(String.valueOf(num.charAt(i)));
            System.out.println("key"+a+"value"+hm.get(a));
            if(!hm.containsKey(i)){
                if(a==0){
                    ans = true;
                }
				else{
					ans = false;
					System.out.println(ans);
				}
            }
            else if(hm.get(i) != a){
                ans = false;
                System.out.println(ans);
				}
        }
        
        
        System.out.println(ans);
    }
}
