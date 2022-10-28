/*
  link: https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
  
  Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.

  The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.



  Example 1:

  Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
  Output: 2
  Explanation: 
  For arr1[0]=4 we have: 
  |4-10|=6 > d=2 
  |4-9|=5 > d=2 
  |4-1|=3 > d=2 
  |4-8|=4 > d=2 
  For arr1[1]=5 we have: 
  |5-10|=5 > d=2 
  |5-9|=4 > d=2 
  |5-1|=4 > d=2 
  |5-8|=3 > d=2
  For arr1[2]=8 we have:
  |8-10|=2 <= d=2
  |8-9|=1 <= d=2
  |8-1|=7 > d=2
  |8-8|=0 <= d=2
*/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       
        int l1 = arr1.length;
        int l2 = arr2.length;
       
        int c = 0;
       
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(Math.abs(arr1[i]-arr2[j])>d){
                    break;
                }                
                else{
                    c++;
                }
            }
        }
       
        return c;
       
    }
}
