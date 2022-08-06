import java.util.*;
class maxAndMinValueOfArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,0,-999,-786,121212};
		
		int len = arr.length;
		
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int t1 =0;
		
		for(int i=0;i<len;i++){
			t1 = arr[i];
			if(t1<min){
				min = t1;
			}
			if(t1>max){
				max = t1;
			}
		}
		System.out.println("Largest: "+max);
		System.out.println("Smallest: "+min);
    }
}