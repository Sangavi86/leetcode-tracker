// Last updated: 7/23/2026, 3:01:44 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlesum=0;
        int doublesum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                singlesum=singlesum+nums[i];
            }
            else{
                doublesum=doublesum+nums[i];
            }
        }
            if(singlesum>doublesum){
                return true;
            }
            if(doublesum>singlesum){
                return true;
            }
            else{
                return false;
            }
    }
}