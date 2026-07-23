// Last updated: 7/23/2026, 2:54:50 PM
class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }

        return -1;
    }
}