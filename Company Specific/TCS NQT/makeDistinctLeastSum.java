import java.util.*;
class makeDistinctLeastSum{
    public static void main(String [] args){
        int arr[] = {2,2,4};
		
		int l=arr.length;
		
		for(int i=0;i<l;i++){
			for(int j=i;j<l;j++){
				if(i!=j){
					if(arr[i]==arr[j]){
						arr[j]+=1;
					}
				}
			}
		}
		int sum=0;
		for(int i=0;i<l;i++){
			sum+=arr[i];
		}
		
		System.out.println("Sum: "+sum);
    }
}
