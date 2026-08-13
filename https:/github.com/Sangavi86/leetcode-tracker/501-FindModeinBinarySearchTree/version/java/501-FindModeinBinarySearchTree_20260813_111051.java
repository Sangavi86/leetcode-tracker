// Last updated: 8/13/2026, 11:10:51 AM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5
6        for (int i = 0; i < n; i++) {
7            ans[i] = -1;
8
9            for (int j = 1; j < n; j++) {
10                int index = (i + j) % n;
11
12                if (nums[index] > nums[i]) {
13                    ans[i] = nums[index];
14                    break;
15                }
16            }
17        }
18
19        return ans;
20    }
21}