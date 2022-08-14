import java.util.*;
class zeroOneBikerPairs{
    public static void main(String [] args){
        int arr[] = {0,1,0,1,1};
		
		int l = arr.length;
		
		int count=0;
		
		for(int i=0;i<l;i++){
			if(arr[i]==0){
				for(int j=0;j<l;j++){
					if(i!=j && arr[j]==1 && i<j){
						count++;
					}
				}
			}
		}
		
		System.out.println("Pair count: "+ count);
    }
}
