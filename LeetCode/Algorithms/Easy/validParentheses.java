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
  /*
    opening - push
    closing - pop
    
    if input size < 2 - then false
    
    while pushing a closing paranthesis:
      - IF NOT matching(check match of stack top and present pushing parenthesis) then false
      - else pop
       
    at the end is stack empty - true
    else - false
  */
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
