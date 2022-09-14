/*
  link: https://leetcode.com/problems/fibonacci-number/
  
  The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

  F(0) = 0, F(1) = 1
  F(n) = F(n - 1) + F(n - 2), for n > 1.
  Given n, calculate F(n).



  Example 1:

  Input: n = 2
  Output: 1
  Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
*/

class Solution {
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public int fib(int n) {
        int ans = fibo(n);
        return ans;
    }
}

/*
  recursive solution takes O(2^n) so iterative approach is better.
  
  if n==0 => return 1
  a=0;
  b=1;
  sum=0;
  while(n>1){
    sum=a+b;
    a = b;
    b = sum;
  }
  
  return sum;
*/
