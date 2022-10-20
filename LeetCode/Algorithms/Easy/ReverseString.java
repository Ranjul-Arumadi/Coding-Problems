/*
  If string is given , then also good approach is to convert to char array and then use two pointers to reverse the string.
*/

class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        
        int i=0,j=l-1;
        char temp= ' ';
        for(i=0;i<j;i++,j--){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
