/*
  check if A and B are both divisible by highest value in [1, AB]
*/

class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int l = nums.length;
        
        for(int i=0;i<l;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        //System.out.println(max+" "+min);
        int gcd = 0, i=1;
        //find greatest gcd
        for(i=1;i<=(min*max);i++){
            if(max%i==0 && min%i==0){
                gcd = i;
            }
        }
        
        return gcd;
    }
}
