// Last updated: 8/24/2026, 11:44:09 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int total = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            total += nums[i];
7        }
8
9        int left = 0;
10        int count = 0;
11
12        for (int i = 0; i < nums.length - 1; i++) {
13            left += nums[i];
14
15            int right = total - left;
16
17            if ((left - right) % 2 == 0) {
18                count++;
19            }
20        }
21
22        return count;
23    }
24}