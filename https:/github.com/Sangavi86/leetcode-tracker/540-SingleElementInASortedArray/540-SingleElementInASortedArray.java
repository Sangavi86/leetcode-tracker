// Last updated: 8/13/2026, 11:30:03 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}