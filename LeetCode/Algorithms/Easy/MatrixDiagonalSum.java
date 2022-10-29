/*
    link: https://leetcode.com/problems/matrix-diagonal-sum/
    
    Given a square matrix mat, return the sum of the matrix diagonals.

    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



    Example 1:


    Input: mat = [[1,2,3],
                  [4,5,6],
                  [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.
    Example 2:

    Input: mat = [[1,1,1,1],
                  [1,1,1,1],
                  [1,1,1,1],
                  [1,1,1,1]]
    Output: 8
*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int s=0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    s+=mat[i][j];
                    System.out.println(mat[i][j]);
                }        
                else if((i+j)==r-1){
                    s+=mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        
        
        return s;
    }
}
