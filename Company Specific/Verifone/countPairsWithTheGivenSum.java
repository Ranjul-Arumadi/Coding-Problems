/*

	Use hashmap
	In first loop -> find the frequency of the letters
	
	In second loop -> find the value of key where key = sum - current array vakue
	
	
	
	Note!!:
	
	if a->b satisfied them b->a is also satisfied 
	so final answer will be ans/2

*/
import java.util.*;
class countPairsWithTheGivenSum{
	public static void main(String [] args){
		/*
		Given arr[] = {1, 5, 7, -1, 5}, sum = 6
		*/
		
		int arr[] = {1,5,7,-1, 5};
		int sum = 6;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		// add to the hashmap. the frequency of the numbers
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}
		
		for(Integer x : hm.keySet()){
			
			System.out.println("Key "+x+" value: "+hm.get(x));
		}
		
		// 1 -> 1 , 5 -> 1 , 7 -> 1 , -1 -> 1
		int needed =0;
		int count =0;
		for(int i=0;i<arr.length;i++){
			needed = sum - arr[i];
			if(hm.get(needed)!=null){
				count+=hm.get(needed);
			}
		}
		
		System.out.println(count/2);
	}
}
