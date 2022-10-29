/*
    link: https://leetcode.com/problems/thousand-separator/
    
    Given an integer n, add a dot (".") as the thousands separator and return it in string format.

 

    Example 1:

    Input: n = 987
    Output: "987"
    Example 2:

    Input: n = 1234
    Output: "1.234"
*/
class Solution {
    public String thousandSeparator(int n) {
        String a = Integer.toString(n);
        
        if(a.length()<=3){
            return a;   
        }
        
        char b[] = a.toCharArray();
        String ans = "";
        int c=-1;
        for(int i=b.length-1;i>=0;i--){
            c++;
            if(c%3==0 && c!=0){
                ans+=".";
            }
            ans+=b[i];
        }
        
        String ans1="";
        char m[] = ans.toCharArray();
        for(int i=m.length-1;i>=0;i--){
            ans1+=m[i];
        }
        
        return ans1;
    }
}
