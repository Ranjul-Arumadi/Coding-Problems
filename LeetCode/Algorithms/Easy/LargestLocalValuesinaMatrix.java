/*
	link: https://leetcode.com/problems/largest-local-values-in-a-matrix/
	
	You are given an n x n integer matrix grid.

	Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

	maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
	In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

	Return the generated matrix.

	 

	Example 1:


	Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
	Output: [[9,9],[8,6]]
	Explanation: The diagram above shows the original matrix and the generated matrix.
	Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
*/
import java.util.*;
class LargestLocalValuesinaMatrix{
    public static void main(String [] args){
        
		int grid[][] = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		
		int oldr = grid[0].length;
		int newr = oldr-2;
		
		int ans[][] = new int[newr][newr];
		
		int lar = Integer.MIN_VALUE;
		
		/*
			Iterate through the ans array (i,j)
			for each cell value, 
			
				Iterate through q. arrays (i->i+3,j->j+3)
				for each cell value in q. array
				find the LARGEST value
			
			put the largest value in the ans array
			
		*/
		
		
		// ans array
		for(int i=0;i<newr;i++){
			for(int j=0;j<newr;j++){
				
				lar = Integer.MIN_VALUE;
				
				// grid array every 3*3
				/*
					!!Iterate through i->i+3 and j->j+3!!
				*/
				for(int k=i;k<i+3;k++){
					for(int l=j;l<j+3;l++){
						if(lar<grid[k][l]){
							lar = grid[k][l];
						}
						// lar = Math.max(lar, grid[k][l]);
					}
				}
				
				ans[i][j] = lar;
			}
		}
		
		for(int i=0;i<newr;i++){
			for(int j=0;j<newr;j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
    }
}
