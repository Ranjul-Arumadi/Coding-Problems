/*
link: https://leetcode.com/problems/search-insert-position/
*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid] >= target)
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
