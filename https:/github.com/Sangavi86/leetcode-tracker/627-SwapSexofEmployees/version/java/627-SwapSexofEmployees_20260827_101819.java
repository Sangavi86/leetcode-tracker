// Last updated: 8/27/2026, 10:18:19 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int a=nums[0]*nums[1]*nums[n-1];
6        int b=nums[n-1]*nums[n-2]*nums[n-3];
7        return Math.max(a,b);
8    }
9}