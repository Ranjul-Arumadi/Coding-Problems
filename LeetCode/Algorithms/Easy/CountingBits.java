/*
  link: https://leetcode.com/problems/counting-bits/
  
  Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

  Example 1:

  Input: n = 2
  Output: [0,1,1]
  Explanation:
  0 --> 0
  1 --> 1
  2 --> 10
*/

class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        int t = 0;
        int digit = 0;
        int c=0;
        int pos=0;
        
        for(int i=0;i<=n;i++){
            t = i;
            while(t>0){
                digit = t%2;
                if(digit==1){
                    c++;    
                }
                t/=2;
            }
            a[pos++] = c;
            c=0;
        }
        
        return a;
    }
}
