/*
Link: https://leetcode.com/problems/calculate-delayed-arrival-time/submissions/983121144/
*/

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int finalTime = arrivalTime+delayedTime;
        if(finalTime >=24){
            return Math.abs(24-finalTime);
        }
        return finalTime;
    }
}
