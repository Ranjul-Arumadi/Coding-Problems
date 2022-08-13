import java.util.*;
class toggleBinary{
    public static void main(String [] args){
        int a = 10;
		int arr[] = new int[100];
		
		Arrays.fill(arr, -1);
		
		int mod = 0;
		int index=0;
		//get binary
		while(a>0){
			mod = a%2;
			arr[index++] = mod;
			a/=2;
		}
		
		//get length of binary
		int len=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==-1){
				break;
			}
			len++;
		}
		
		//move binary to new array in proper order
		int bin[] = new int[len];
		index = 0;
		for(int i=len-1;i>=0;i--){
			bin[index++] = arr[i];
		}
		
		//toggle one and zero
		for(int i=0;i<len;i++){
			if(bin[i]==0){
				bin[i] = 1;
			}
			else {
				bin[i] =0;
			}
		}
		
		//binary to decimal
		/*
			2^0*val1 + 2^1*val2...from right to left
		*/
		int mul=0, ans=0;
		
		int x=0;
		for(int i=len-1;i>=0;i--){
			mul=(int)Math.pow(2, x++);
			mul*=bin[i];
			ans+=mul;
		}
		
		//display o/p
		System.out.println("ans: "+ ans);
		for(int i=0;i<len;i++){
			System.out.print(bin[i]+" ");
		}
    }
}
