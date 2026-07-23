// Last updated: 7/23/2026, 2:57:12 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false; // can't reach this index
            
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        
        return true;
    }
}