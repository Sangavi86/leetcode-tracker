// Last updated: 9/7/2026, 9:53:37 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true;
        boolean dec=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                inc=false;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dec=false;
            }
        }
        return inc||dec;
    }
}