/*
  link: https://leetcode.com/problems/palindrome-number/
  
  Given an integer x, return true if x is palindrome integer.

  An integer is a palindrome when it reads the same backward as forward.

  For example, 121 is a palindrome while 123 is not.


  Example 1:

  Input: x = 121
  Output: true
  Explanation: 121 reads as 121 from left to right and from right to left.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int digit=0;
        int ans=0;
        while(x>0){
            digit = x%10;
            ans = (ans*10) + digit;
            x=x/10;
        }
        if(ans==copy){
            return true;
        }
        else{
            return false;
        }
    }
}
