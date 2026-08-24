// Last updated: 8/24/2026, 12:03:32 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            int right=total-left;
            if((left-right)%2==0){
                count++;
            }
        }
        return count;
    }
}