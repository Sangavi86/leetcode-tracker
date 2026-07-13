// Last updated: 7/13/2026, 8:52:43 AM
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