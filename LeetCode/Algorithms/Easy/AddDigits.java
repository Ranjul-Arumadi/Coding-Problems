/*

    link: https://leetcode.com/problems/add-digits/
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

    Example 1:

    Input: num = 38
    Output: 2
    Explanation: The process is
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2 
    Since 2 has only one digit, return it.
    
    equivalent to taking the remainder upon division by 9 (except when the digital root is 9, where the remainder upon division by 9 will be 0), which allows it to be used as a divisibility rule.
   
*/

class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
       
        int rem = num%9;
       
        if(rem==0){
            return 9;
        }
       
        return rem;
    }
}
