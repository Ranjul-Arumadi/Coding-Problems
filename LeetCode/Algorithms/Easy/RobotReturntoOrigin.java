/*
    link: https://leetcode.com/problems/robot-return-to-origin/submissions/
    
    Two variables have to be used to solve the question. One variable keeps track of horizontal motion and the other one tracks vertical motion.
    
    There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

    You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

    Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

    Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.



    Example 1:

    Input: moves = "UD"
    Output: true
    Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.

    
*/
class Solution {
    public boolean judgeCircle(String moves) {
        char a[] = moves.toCharArray();
        int l = a.length;
        int vertical=0, horizontal=0;
        for(int i=0;i<l;i++){
            if(a[i]=='U'){
                vertical++;
            }
            else if(a[i]=='R'){
                horizontal++;
            }
            else if(a[i]=='L'){
                horizontal--;
            }
            else{
                vertical--;
            }
        }
        
        if(vertical==0 && horizontal==0){
            return true;
        }
        return false;
    }
}
