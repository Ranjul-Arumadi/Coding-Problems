/*
Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

Notes:
1. Integer.toString() inorder to get the length of the number as string
2. If unque digits were needed then we can use hashset instead of array to remove duplicated
*/

class Solution {
    public int countDigits(int num) {
	    int numCopy = num;
	    int count=0;
	    String numString = Integer.toString(num);
	    int len = numString.length();
	    int a[] = new int[len];
	    int i=0;
	    while(numCopy>0){
	        a[i++] = numCopy%10;
	        numCopy/=10;
	    }
	    
	    for(int x: a){
	        if(num%x==0){
	            count++;
	        }
	    }

        return count;
        
    }
}
