/*
    link: https://leetcode.com/problems/maximum-69-number/submissions/
    
    You are given a positive integer num consisting only of digits 6 and 9.

    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



    Example 1:

    Input: num = 9669
    Output: 9969
    Explanation: 
    Changing the first digit results in 6669.
    Changing the second digit results in 9969.
    Changing the third digit results in 9699.
    Changing the fourth digit results in 9666.
    The maximum number is 9969.
*/
class Solution {
    public int maximum69Number (int num) {
        
        /*
            logic: highest number will be obtained by replcing the first occurence of 6 with 9.
        */
        String s = Integer.toString(num);
        int l = s.length();
        String ans = "";
        int pos=0;
        
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='6'){
                ans+='9';  
                pos = i;
                break;
            }
            else{
                ans+='9';
                pos = i;
            }
        }
        
        // try catch can be replaced by seeing if index value has crossed the length of the string
        try{
           for(int i=pos+1;i<l;i++){
                ans+=s.charAt(i);
           } 
        }
        catch(Exception e){
            
        }
        
        int x = Integer.parseInt(ans);
        return x;
    }
}
