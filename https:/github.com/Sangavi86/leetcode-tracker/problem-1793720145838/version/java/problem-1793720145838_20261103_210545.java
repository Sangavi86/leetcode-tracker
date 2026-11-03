// Last updated: 11/3/2026, 9:05:45 PM
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        String ans = "";
4        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
5            if (i < word1.length())
6                ans = ans + word1.charAt(i);
7            if (i < word2.length())
8                ans = ans + word2.charAt(i);
9        }
10        return ans;
11    }
12}