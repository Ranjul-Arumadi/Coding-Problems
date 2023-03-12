/*
Link: https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
*/

class a{
	public static void main(String [] args){
		
		int a[] = {1, -2, 4, -5, 1};
		int n= 5;
		int sum=0;
		int c=0;
		
		//start
		for (int i=0; i <n; i++){
			//end
			for (int j=i; j<n; j++){
				//start to end
				for (int k=i; k<=j; k++){
					System.out.print(a[k]+" ");
					sum+=a[k];
				}
				if(sum<0){
					c++;
				}
				//System.out.println("Sum: "+sum);
				sum=0;
				System.out.println();
			}
		}
		System.out.println("Count: "+c);
		
	}
}



