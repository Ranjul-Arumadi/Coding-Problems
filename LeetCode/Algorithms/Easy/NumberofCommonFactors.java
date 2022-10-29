/*
  link: https://leetcode.com/problems/number-of-common-factors/
  
  Given two positive integers a and b, return the number of common factors of a and b.

  An integer x is a common factor of a and b if x divides both a and b.



  Example 1:

  Input: a = 12, b = 6
  Output: 4
  Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
*/
class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        if(a==1 && b==1){
            return 1;
        }
        for(int i=1;i<a*b;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        
        return c;
    }
}
