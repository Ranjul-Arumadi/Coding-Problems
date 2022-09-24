/*
	Given an integer array nums and an integer k, return the kth largest element in the array.

	Note that it is the kth largest element in the sorted order, not the kth distinct element.

	You must solve it in O(n) time complexity.

	 

	Example 1:

	Input: nums = [3,2,1,5,6,4], k = 2
	Output: 5
*/

import java.util.*;
class kthLargestElementInAnArray{
    public static void main(String [] args){
        int nums[] = {3,2,1,5,6,4};
		int k = 2;
		
		/*
			Find largest elem: minheap and check is array value is greater than peek
			Find smallest elem: maxheap and check is array value is smaller than peek
			
			
			make min heap using the priorityqueue in java. 
			the size of the min heap is equal to the value of the k value
			
			after this, start from k index.
			if the peek of the heap is less than the array[i] value then swap
			
			swap: pop from heap and add from array
		*/
		
		//min heap in java: priorityqueue
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//add k values
		for(int i=0;i<k;i++){
			pq.add(nums[i]);
		}
		
		//iterate from kth index to end and do comparisions + SWAP
		
		for(int i=k;i<nums.length;i++){
			if(nums[i]>pq.peek()){
				pq.poll(); // remove the min heap top
				pq.add(nums[i]); // add the array value
			}
		}
		
		System.out.println(pq.peek()); // final ans = heaps top most element
    }
}
