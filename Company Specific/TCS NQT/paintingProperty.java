/*
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example
*/
import java.util.*;
class paintingProperty{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int interior = 18, exterior = 12;
		int intCount =0, extCount =0;
		
		intCount = sc.nextInt();
		extCount = sc.nextInt();
		
		float intSA[] = new float[intCount];
		float extSA[] = new float[extCount];
		
		float insum=0, extsum=0;
		for(int i=0;i<intCount;i++){
			intSA[i] = sc.nextFloat();
			insum+=intSA[i];
		}
		for(int i=0;i<extCount;i++){
			extSA[i] = sc.nextFloat();
			extsum+=extSA[i];
		}
		
		float ans = (interior*insum) + (exterior*extsum);
		
		System.out.println("Total estimated Cost : "+ans+" INR");
	
	}
}