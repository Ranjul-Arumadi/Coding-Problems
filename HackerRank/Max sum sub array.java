import java.util.*;
class MaxSumSubArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		int arr[] = {-5,4,6,-3,4,-1};
		
		int sum=0, max=0;
		int s=0,e=0;
		int size = arr.length;
		for(int start=0;start<size;start++){
			for(int end=start;end<size;end++){
				for(int i=start;i<=end;i++){
					sum+=arr[i];
				}
				if(sum>max){
					max = sum;
					s=start;
					e=end;
				}
				sum=0;
			}
			
		}
		
		System.out.println("Max sub array sum: "+ max);
		for(int i=s;i<=e;i++){
			System.out.print(arr[i]+" ");
		}
		
    }
}
