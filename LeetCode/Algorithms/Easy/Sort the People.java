/*
Link: https://leetcode.com/problems/sort-the-people/description

Approaches:
-----------

Approach 1 ->
Use bubblesort and sort based on the heights. Since the indices are matching do the same sort for the names also.

Approach 2 ->
Use a treeMap. TreeMap is a DS that works on the basis of red black trees. It maintains the sort based on the keys. So make the key as height.

Methods : tm.put(K,V);
*/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String tempName="";
        int tempHeight=0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    tempHeight = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = tempHeight;

                    tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }      
            }
        }

        return names;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> tm = new TreeMap<>();
        for(int i=0;i<names.length;i++){
            tm.put(heights[i], names[i]);
        }

        String ans[] = new String[names.length];
        int i=names.length-1;
        for(Integer key: tm.keySet()){
            ans[i--] = tm.get(key);
        }

        return ans;

    }
}
