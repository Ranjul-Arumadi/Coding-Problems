/*
  link: https://leetcode.com/problems/jewels-and-stones/
  
  
  You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
*/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jl = jewels.length();
        int sl = stones.length();
        int c=0;
        char x = ' ';
        for(int i=0;i<jl;i++){
            for(int j=0;j<sl;j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    c++;
                }
            }
        }
        
        return c;
    }
}
