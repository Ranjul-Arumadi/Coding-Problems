/*
    link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
    Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

    Example 1:

    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    Output: 8
    Explanation: There are 8 negatives number in the matrix.
*/
class Solution {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        
        return count;
    }
}
