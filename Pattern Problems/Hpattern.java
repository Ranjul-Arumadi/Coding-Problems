/*
N=5
*.........*
**.......**
***.....***
****...****
*****.*****
***********
*****.*****
****...****
***.....***
**.......**
*.........*

*/
import java.util.*;
class Hpattern{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int mid = (n*2)+1;
		
		int star = 1;
		int dot = (n*2)-1;
		//part 1
		for(int i=0;i<mid;i++){
			for(int j=0;j<star;j++){
				System.out.print("*");
			}
			for(int k=0;k<dot;k++){
				System.out.print(".");
			}
			for(int l=0;l<star;l++){
				System.out.print("*");
			}
			if(star<=n){
				System.out.println();
			}
			
			if(dot==1){
				break;
			}
			star++;
			dot = dot-2;
			
			
			
		}
		
		// all stars
		for(int i=0;i<mid;i++){
			System.out.print("*");
		}
		System.out.println();
		
		
	
		star = n;
		dot = 1;
		
		//part 2
		for(int i=0;i<mid;i++){
			for(int j=0;j<star;j++){
				System.out.print("*");
			}
			for(int k=0;k<dot;k++){
				System.out.print(".");
			}
			for(int l=0;l<star;l++){
				System.out.print("*");
			}

			System.out.println();

			
			if(star==1){
				break;
			}
			star--;
			dot = dot+2;
			
			
		}
		
		
	}
}
