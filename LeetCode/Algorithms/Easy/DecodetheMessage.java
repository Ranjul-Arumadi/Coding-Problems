/*
    link: https://leetcode.com/problems/decode-the-message/
    
    Use hashmap to map the key to the value. Then iterate over the value of the hashmap with the message to be decoded.
    
    You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

    Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
    Align the substitution table with the regular English alphabet.
    Each letter in message is then substituted using the table.
    Spaces ' ' are transformed to themselves.
    For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
    Return the decoded message.



    Example 1:


    Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
    Output: "this is a secret"
    Explanation: The diagram above shows the substitution table.
    It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
    
*/

class Solution {
    public String decodeMessage(String key, String message) {
        int kl = key.length();
        int ml = message.length();
        
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        char a = 'a';
        
        for(int i=0;i<kl;i++){
            if(!hm.containsKey(key.charAt(i)) && key.charAt(i)!=' '){
                hm.put(key.charAt(i), a++);
            }
            else{
                ;
            }
        }
        String ans = "";
        for(Character c: message.toCharArray()){
            if(hm.containsKey(c)){
                ans+=hm.get(c);
            }
            else if(c==' '){
                ans+=' ';
            }
        }
        
        return ans;
    }
}
