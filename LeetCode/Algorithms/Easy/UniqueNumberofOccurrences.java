/*
    link: https://leetcode.com/problems/unique-number-of-occurrences/
    
    Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.



    Example 1:

    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    
    Approach:
    - HashMap to count occurences
    - use set to store the values of the key
    - if unique set size and hashmap size will be equal and not otherwise
*/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int l = arr.length;
        
        for(int i=0;i<l;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
            }
            else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        
        Set<Integer> st = new HashSet<Integer>();
        
        for(Integer k: hm.keySet()){
            st.add(hm.get(k));
        }
        
        int l1 = hm.size();
        int l2 = st.size();
        
        if(l1!=l2){
            return false;
        }
        
        return true;
    }
}
