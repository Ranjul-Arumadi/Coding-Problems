/*
    link: https://leetcode.com/problems/richest-customer-wealth/
    
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



    Example 1:

    Input: accounts = [[1,2,3],[3,2,1]]
    Output: 6
    Explanation:
    1st customer has wealth = 1 + 2 + 3 = 6
    2nd customer has wealth = 3 + 2 + 1 = 6
    Both customers are considered the richest with a wealth of 6 each, so return 6.
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int c = accounts[0].length;
        int t = 0;
        int s = Integer.MIN_VALUE;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t+=accounts[i][j];        
            }
            s = Math.max(s,t);
            t=0;
        }
        
        return s;
    }
}
