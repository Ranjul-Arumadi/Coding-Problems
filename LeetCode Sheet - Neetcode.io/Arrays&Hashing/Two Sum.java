/*
	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
*/

/*
	Approach:
	- Use hashmap.
	- BUT dont store everything at once
	- as each value is read check if [SUM_NEEDED-value] exist; if yes then return index from hashmap and i value of loop
	- otherwise add the value and continue the process till all the values are added
	- since a valid ans exists we can get the answer

*/
import java.util.*;


class twoSum {
		static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int val=0;
        int differenceNeeded=0;
        int ans[] = {0,0};
        
        for(int i=0;i<nums.length;i++){
            
            val = nums[i];
            differenceNeeded = (target - val);
            
            if(hm.containsKey(differenceNeeded)){
                ans[0] = hm.get(differenceNeeded);
                ans[1] = i;
                return ans;
                
            }
            else{
                hm.put(val, i);
            }
        }
        
        return ans;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		
		int nums[] = {2,7,11,15};
		int target = 9;
		int ans[] = new int[2];
		ans = twoSum(nums, target);
		
		for(Integer i: ans){
			System.out.print(i+" ");
		}
		
		
    }
}
