import java.util.*;
/*
Count approach takes O(n), comapred to sorting in O(n^2)

*/
class dutchNationalFlag{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int len = arr.length;
		
		int zerocount=0, onecount =0, twocount=0;
		for(int i=0;i<len;i++){
			if(arr[i]==0){
				zerocount++;
			}
			else if(arr[i]==1){
				onecount++;
			}
			else{
				twocount++;
			}
		}
		/*
			0 -> zero count
			zerocount -> zerocount+onecount
			zerocount+onecount -> zerocount+onecount+twocount
		*/
		//fill 0
		for(int i=0;i<zerocount;i++){
			arr[i] = 0;
		}
		
		//fill 1
		for(int i=zerocount;i<(zerocount+onecount);i++){
			arr[i] = 1;
		}
		
		//fill 2
		for(int i=(zerocount+onecount);i<(zerocount+onecount+twocount);i++){
			arr[i] = 2;
		}
		
		//print
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
    }
}