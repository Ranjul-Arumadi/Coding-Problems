/*
Link: https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/

Exaplantion: https://leetcode.com/problems/minimum-bit-flips-to-convert-number/solutions/3728898/using-xor-java-beginner-friendly-detailed-code/
*/
class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while(start>0 || goal>0){
            int startBit = start%2;
            start/=2;
            int goalBit = goal%2;
            goal/=2;
            int xorResult = startBit ^ goalBit; 
            if(xorResult==1){
                count++;
            }
        }

        return count;
    }
}
