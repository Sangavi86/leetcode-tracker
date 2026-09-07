// Last updated: 9/7/2026, 9:52:30 AM
class Solution {
    public int[] runningSum(int[] nums) {

        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}