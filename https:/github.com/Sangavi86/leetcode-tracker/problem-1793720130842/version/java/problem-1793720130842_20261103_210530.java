// Last updated: 11/3/2026, 9:05:30 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3
4        String ans = "";
5
6        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
7
8            if (i < word1.length())
9                ans = ans + word1.charAt(i);
10
11            if (i < word2.length())
12                ans = ans + word2.charAt(i);
13        }
14
15        return ans;
16    }
17}