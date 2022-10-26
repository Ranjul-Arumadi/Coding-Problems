/*
    link: https://leetcode.com/problems/single-number/
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.



    Example 1:

    Input: nums = [2,2,1]
    Output: 1
    
    
    Approach 1:
    ----------
    Hashmaps - but not space optimum
    
    Approach 2:
    -----------
    XOR
    Basically, you when you XOR the same mask twice, you are left with the original number. Since there is only one instance which is not duplicated, it should be what is left over when all numbers are XOR'd together.
    0 ^ 0 --> 0
    0 ^ 1 --> 1
    1 ^ 0 --> 1
    1 ^ 1 --> 0
    
    1. A^A=0
    2. A^0=A
    2. A^B^A=B
    3. (A^A^B) = (B^A^A) = (A^B^A) = B This shows that position doesn't matter.
    4. Similarly , if we see , a^a^a......... (even times)=0 and a^a^a........(odd times)=a


    So, our array is arr[]: [5, 1, 3, 1, 3, 4, 5, 7, 4] 

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
     ↑  ↑
     5 ^ 1 = 4

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
           ↑                       
           4 ^ 3 = 7 (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
              ↑
              7 ^ 1 = 6 (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
                 ↑
                 6 ^ 3 = 5 (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
                    ↑
                    5 ^ 4 = 1  (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
                       ↑
                       1 ^ 5 = 4 (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
                          ↑
                          4 ^ 7 = 3 (prev answer xor current index)

    [5, 1, 3, 1, 3, 4, 5, 7, 4]
                             ↑
                             3 ^ 4 = 7 (prev answer xor current index)

    So, the element which we got as left should be our answer, so the answer is '7'
    
    


*/
class Solution {
    public int singleNumber(int[] nums) {
        int l = nums.length;
        int result=0;
        for(int i=0;i<l;i++){
            result = result^nums[i];
        }
        
        return result;
    }
}
