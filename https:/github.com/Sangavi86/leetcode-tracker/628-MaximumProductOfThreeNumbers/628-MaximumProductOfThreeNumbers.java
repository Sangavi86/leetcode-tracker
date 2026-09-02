// Last updated: 9/2/2026, 2:46:14 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0]*nums[1]*nums[n-1];
        int b=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(a,b);
    }
}