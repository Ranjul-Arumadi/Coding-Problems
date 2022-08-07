import java.util.*;
/*
O(n) appraoach

requires 3 pointing vas; low, mid, high

low is 0 values, mid for 1 and high for 2

low, mid initially points to 0 index
high points to length-1 index

while mid<=high

all checking is done based on mid

if value at mid is 0
 - swap mid, low value 
 - inc low and mid

if value at mid is 1
 - just inc mid

if value at mid is 2 
 - swap mid and high
 -  decremrent high

*/
class dutchNationalFlag3pointersAlgo{
    
	static void swap(int arr[], int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int arr[] = {0, 1,2,0,1,2,0,0,1,1,1,2,2,1,2,0,1,2};
		
		int len = arr.length;
		
		int low = 0, mid = 0, high = len-1;
		
		/*
			
			0 1 1 0 1 2 1 2 0 0 0 1
			L                     H
			M
		
		*/
		while(mid<=high){
			if(arr[mid]==0){
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1){
				mid++;
			}
			else if(arr[mid]==2){
				swap(arr, mid,high);
				high--;
			}
		}
		
		//print
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
    }
}