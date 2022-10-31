/*
  link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
  There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

  For each location indices[i], do both of the following:

  Increment all the cells on row ri.
  Increment all the cells on column ci.
  Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.



  Example 1:


  Input: m = 2, n = 3, indices = [[0,1],[1,1]]
  Output: 6
  Explanation: Initial matrix = [[0,0,0],[0,0,0]].
  After applying first increment it becomes [[1,2,1],[0,1,0]].
  The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
*/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        //int all to 0
        int a[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = 0;
            }
        }
        
        int r = indices.length;
        int c = indices[0].length;
        int row=0, col=0;
        
        // do increments
        for(int i=0;i<r;i++){
            
            row = indices[i][0];
            col = indices[i][1];
            
            // for row
            for(int k=0;k<n;k++){
                a[row][k]+=1;
            }
            
            // for cols
            for(int k=0;k<m;k++){
                a[k][col]+=1;
            }
        }
        
        //count oods
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
