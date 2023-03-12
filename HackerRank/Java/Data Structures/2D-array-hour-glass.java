/*
link: https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
*/
class a{
	public static void main(String [] args){
		
		int a[][] = {
			{1,1,1,0,0,0},
			{0,1,0,0,0,0},
			{1,1,1,0,0,0},
			{0,0,2,4,4,0},
			{0,0,0,2,0,0},
			{0,0,1,2,4,0}	
		};
		
		int sum = Integer.MIN_VALUE;
		int tempSum = 0;
		
		for(int r=0;r<=3;r++){
			for(int c=0;c<=3;c++){
				tempSum+= 
				a[r][c]  +  a[r][c+1]  + a[r][c+2]
						 + a[r+1][c+1] + 
				a[r+2][c]+ a[r+2][c+1] + a[r+2][c+2];		
			
				sum = Math.max(sum, tempSum);
				tempSum=0;
			}
		}
		System.out.println(sum);
	}
}
