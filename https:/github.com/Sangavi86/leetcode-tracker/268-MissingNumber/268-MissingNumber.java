// Last updated: 7/23/2026, 2:54:54 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum=tsum+nums[i];
        }
        return sum-tsum;
    }
}