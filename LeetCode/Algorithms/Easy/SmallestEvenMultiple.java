/*
  link: https://leetcode.com/problems/smallest-even-multiple/
  
  A guaranteed way to find a multiple of 2 and n is to multiply them together. When is this the answer, and when is there a smaller answer?
  
  There is a smaller answer when n is even.
*/
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n*2 > n){
            if(n%2!=0){
                return n*2;
            }
            else{
                return n;
            }
            
        }
        return n*2;
    }
}
