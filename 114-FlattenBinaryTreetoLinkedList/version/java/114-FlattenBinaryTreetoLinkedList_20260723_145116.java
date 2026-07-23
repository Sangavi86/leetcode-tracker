// Last updated: 7/23/2026, 2:51:16 PM
1class Solution {
2
3    public int numDistinct(String s, String t) {
4
5        int[][] dp = new int[s.length() + 1][t.length() + 1];
6
7        for (int i = 0; i <= s.length(); i++) {
8            for (int j = 0; j <= t.length(); j++) {
9                dp[i][j] = -1;
10            }
11        }
12
13        return solve(s, t, 0, 0, dp);
14    }
15
16    public int solve(String s, String t, int i, int j, int[][] dp) {
17
18        if (j == t.length())
19            return 1;
20
21        if (i == s.length())
22            return 0;
23
24        if (dp[i][j] != -1)
25            return dp[i][j];
26
27        if (s.charAt(i) == t.charAt(j)) {
28            dp[i][j] = solve(s, t, i + 1, j + 1, dp)
29                     + solve(s, t, i + 1, j, dp);
30        } else {
31            dp[i][j] = solve(s, t, i + 1, j, dp);
32        }
33
34        return dp[i][j];
35    }
36}