/*
	Given N gold wires, each wire has a length associated with it. At a time, only two adjacent small wres
	assembled at the end of a large wire and the cost of forming is the sum of their length. Find the minimum 
	cost when all wires are assembled to form a single wire.

*/

/*
	Brute Force approach:
	
	- sort the arr
	- get first 2 mins vals
	- add vals to get X as sum
	- move this sum to SUM array
	- add X to array
	- repeat
	
	- add up the values in the new array to get min cost
*/
import java.util.*;
class goldWires{
    public static void main(String [] args){
        //int arr[] = {2,5,4,8,6,9}; //min cost = 85
		int arr[] = {7,6,8,6,1,1}; //min cost = 68
		
		int l = arr.length;
		
		int a=0, b=0;
		int sum[] = new int[20];
		Arrays.fill(sum, -1);
		
		int arr1[] = new int[20];
		Arrays.fill(arr1, -1);
		
		/*
			sort the array
			the first, second index will have min values
			add them
			put them back to array
			set other value to Integer.MAX_VALUE
			put sum in sum array
			REPEAT
			
			
			Iterate over sum array till l-1 to calculate the sum.
		*/
		
		
		int t=0;
		int index=0;
		while(l>0){
			Arrays.sort(arr);
			a = arr[0];
			b = arr[1];
			t = a+b;
			arr1[index++] = t;
			arr[0] = t;
			arr[1] = Integer.MAX_VALUE;
			l--;
		}
		
		l = arr.length;
		int cost=0;
		for(int i=0;i<l-1;i++){
			cost+=arr1[i];
		}
		
		System.out.println("Min cost: "+ cost);
    }
}
