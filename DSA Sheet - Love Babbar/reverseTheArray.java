import java.util.*;
class reverseTheArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3};
		
		int len = arr.length;
		int end = len-1;
		int temp=0;
		for(int i=0;i<len/2;i++){
			temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
		}
		
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
    }
}