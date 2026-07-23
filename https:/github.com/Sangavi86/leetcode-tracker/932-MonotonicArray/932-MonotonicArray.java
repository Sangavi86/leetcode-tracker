// Last updated: 7/23/2026, 3:03:26 PM
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