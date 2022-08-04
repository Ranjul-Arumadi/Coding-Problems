/*
Find the 15th term of the series?
0,0,7,6,14,12,21,18, 28
Explanation :
In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }
And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – } 

the 0,0 is the beginning might confuse @ first, but 0+7 = 7, 7+7 = 14, 14+7 = 21...and so on..
the same applies for multiples of 6 also. 
*/
import java.util.*;
class numberSeriesTwist1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int term = sc.nextInt();
		
		int a=0, b=0;
		//a - even value | b - odd value
		// start index from 1
		for(int i=1;i<=term;i++){ //0 to i<term also works
			if(i%2==0)//even = muleiples of 6
			{
				a+=6;
			}
			else // odd - multiples of 7
			{
				b+=7;
			}
		}
		if(term%2==0){
			//decremnt by 6 while sout
			System.out.println("Value is: "+ (a-6));
		}
		else{
			//decremnt by 7 while sout
			System.out.println("Value is: "+ (b-7));
		}
	}
}
