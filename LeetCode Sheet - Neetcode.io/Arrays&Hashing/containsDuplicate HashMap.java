/*
	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

import java.util.*;
class containsDuplicate{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int val=0;
		
		for(int i=0;i<nums.length;i++){
			val = nums[i];
			if(hm.containsKey(val)){
				hm.put(val, hm.get(val)+1);
				/*
					We can return false at this point itself. No need of further iterations through the HashMap.
				*/
			}
			else{
				hm.put(val, 1);
			}
		}
		
		for(Integer i: hm.keySet()){
			int x = hm.get(i);
			if(x>1){
				System.out.println("Has duplis");
				return;
			}
			System.out.println("key: "+ i + "Value: "+ x);
		}   
		System.out.println("No duplis");
		
		
    }
}
