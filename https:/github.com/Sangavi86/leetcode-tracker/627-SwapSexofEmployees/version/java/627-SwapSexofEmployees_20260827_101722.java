// Last updated: 8/27/2026, 10:17:22 AM
1import java.util.Arrays;
2
3class Solution {
4    public int maximumProduct(int[] nums) {
5        Arrays.sort(nums);
6
7        int n = nums.length;
8
9        int a = nums[0] * nums[1] * nums[n - 1];
10        int b = nums[n - 1] * nums[n - 2] * nums[n - 3];
11
12        return Math.max(a, b);
13    }
14}