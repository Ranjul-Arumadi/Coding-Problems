/*
  link: https://leetcode.com/problems/defanging-an-ip-address/
  
  Given a valid (IPv4) IP address, return a defanged version of that IP address.

  A defanged IP address replaces every period "." with "[.]".



  Example 1:

  Input: address = "1.1.1.1"
  Output: "1[.]1[.]1[.]1"
*/

class Solution {
    public String defangIPaddr(String address) {
        int l = address.length();
        String ans = "";
        for(int i=0;i<l;i++){
            if(address.charAt(i)=='.'){
                ans+="[.]";
            }
            else{
                ans+=address.charAt(i);
            }
            
        }
        
        return ans;
    }
}
