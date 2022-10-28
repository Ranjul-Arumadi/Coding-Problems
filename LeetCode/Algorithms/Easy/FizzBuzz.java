/*
    link: https://leetcode.com/problems/fizz-buzz/
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.


    Example 1:

    Input: n = 3
    Output: ["1","2","Fizz"]
*/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l = new ArrayList<String>();
       
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                l.add("FizzBuzz");
            }
            else if(i%3==0){
                l.add("Fizz");
            }
            else if(i%5==0){
                l.add("Buzz");
            }
            else{
                l.add(Integer.toString(i));
            }
        }
       
        return l;
    }
}
