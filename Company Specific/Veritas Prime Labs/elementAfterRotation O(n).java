/*
2. Given non-negative integers K, M, and an array arr[ ] consisting of N elements, the task is to find the Mth element of the array after K right rotations.
Input: arr[] = {3, 4, 5, 23}, K = 2, M = 1
Output: 5
Input: arr[] = {1, 2, 3, 4, 5}, K = 3, M = 2
Output: 4
*/

import java.util.*;
class elementAfterRotation{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int arr[] = {1, 2, 3, 4, 5};
		int rot = 3;
		int index = 2;
		
		int size = arr.length;
		/*
		r0: 1 2 3 4 5
		r1: 5 1 2 3 4
		r2: 4 5 1 2 3 
		r3: 3 4 5 1 2
		r4: 2 3 4 5 1
		r5: r0
		
		So after 4-1[size of array-1] rotations it goes back to initial state
		
		*/
		
		/*  O(n) approach  
			Uses a temporary array to store one half of the present array at first.
		*/
		
		if(rot==size-1){
			System.out.println("value is: "+ arr[index]);
			return;
		}
		
		int temp[] = new int[size];
		int x=0;
		for(int i=(size-rot);i<size;i++){
			temp[x++] = arr[i];
		}
		for(int i=0;i<(size-rot);i++){
			temp[x++] = arr[i];
		}
	
		System.out.println("value is: "+ temp[index]);
		
	
		
		
		
		
    }
}
