/*
  link: https://leetcode.com/problems/determine-color-of-a-chessboard-square/
  
  You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.



  Return true if the square is white, and false if the square is black.

  The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.



  Example 1:

  Input: coordinates = "a1"
  Output: false
  Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
*/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ltr = coordinates.charAt(0);
        int num = coordinates.charAt(1);

        if (ltr == 'b' || ltr == 'd' || ltr == 'f' || ltr == 'h') {
            if (num % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else if (ltr == 'a' || ltr == 'c' || ltr == 'e' || ltr == 'g') {
            if (num % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }
}
