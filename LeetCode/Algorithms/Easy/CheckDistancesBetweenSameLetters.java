/*
  link: https://leetcode.com/problems/check-distances-between-same-letters/
  
  You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.

  Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

  In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.

  Return true if s is a well-spaced string, otherwise return false.



  Example 1:

  Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
  Output: true
  Explanation:
  - 'a' appears at indices 0 and 2 so it satisfies distance[0] = 1.
  - 'b' appears at indices 1 and 5 so it satisfies distance[1] = 3.
  - 'c' appears at indices 3 and 4 so it satisfies distance[2] = 0.
  Note that distance[3] = 5, but since 'd' does not appear in s, it can be ignored.
  Return true because s is a well-spaced string.
  
  Approach:
  --------
  
  - Find the first and second position of each characters in the char array.
  - Find the difference in position as i-j-1 abs value
  - Use hashmap to ensure no duplication and also ensures only the first positions are taken
  - take char value to int to get ascii value
  - do int value- 97 to get index value
  - do comparison 
  - return t or f appropriatly

*/
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        char a[] = s.toCharArray();
        int l = a.length;
        int pos1 =0, pos2=0;
        char c = ' ';
        int l2 = distance.length;
        int d[] = new int[l2];
        int pos=0;
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(int i=0;i<l;i++){
            c = a[i];
            pos1 = i;
            for(int j=0;j<l;j++){
                if(j==i){
                    continue;
                }
                else if(a[j]==c){
                    pos2 = j;
                    break;
                }
            }
            
            if(!hm.containsKey(c)){
                int t = Math.abs(pos1-pos2)-1;
                hm.put(c, Math.abs(pos1-pos2)-1);
            }
        }

        int f=0;
        for(Character x: hm.keySet()){
            int ascii = x-97;
            if(distance[ascii]!=hm.get(x)){
                return false;
            }

            
        }
        
        return true;
        
        
    }
}
