/*
  link: https://leetcode.com/problems/valid-parentheses/
  
  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

  An input string is valid if:

  Open brackets must be closed by the same type of brackets.
  Open brackets must be closed in the correct order.
  Every close bracket has a corresponding open bracket of the same type.


  Example 1:

  Input: s = "()"
  Output: true
  
  Approach:
  Use stack
  
  If opening - push to the stack
  If closing - check if previous(peek) matches with the current one. - is ys es then pop - no match then return FALSE
  at end check if stack is empty - if yes then it is valid, otherwise NO
*/
class Solution {
    static boolean opening(char x){
        if(x=='{' || x=='(' || x=='['){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean checkMatch(char curr, char prev){
        if(curr=='}' && prev=='{' || curr==']' && prev=='[' || curr==')' && prev=='('){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int l = s.length();
        if(l<2){
            return false;
        }
        char x = ' '; 
        for(int i=0;i<l;i++){
            x = s.charAt(i);
            if(opening(x)){
                st.push(x);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else if(!checkMatch(x, st.peek())){
                   return false;
                }
                else{
                    st.pop();
                }
            }
        }
        
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}
