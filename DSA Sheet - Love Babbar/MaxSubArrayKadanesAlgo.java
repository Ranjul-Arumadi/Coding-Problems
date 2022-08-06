import java.util.*;
class MaxSubArrayKadanesAlgo{
	
	/*
		Kadanes algo. solves the problem in O(n) time. It only returns the max value[sum of subarray]. It cant print the sub array. For printing the sub array we have to modify the algo.

		Algo:
		- loop to traverse the array till end
		- two vars one to keep local sum, annother to keeoo global sum
		- update local sum variable
		- if local sum>global sum; update global sum
		
		- MOST IMP STEP :- !! if local sum<0 set localsum=0 !!
		
		
	*/
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		int arr[] = {-5,4,6,-3,4,-1};
		
		int len = arr.length;
		int sum=0;
		
		int max = Integer.MIN_VALUE; //!!IMP!! in case every all values are -ve etc
		
		int beginning =0, start=0, end=0;
		for(int i=0;i<len;i++){
			sum+=arr[i];
			if(sum>max){
				max = sum;
			}
			
			//!!IMPORTANT!!
			if(sum<0){
				sum=0; // reset the sum value
			}
		}
		System.out.println("Max sub array sum = "+max);
		
		
		
		
    }
}