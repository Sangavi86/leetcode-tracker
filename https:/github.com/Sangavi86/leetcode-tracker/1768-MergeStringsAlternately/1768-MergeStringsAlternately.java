// Last updated: 11/3/2026, 9:06:35 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                ans = ans + word1.charAt(i);
            if (i < word2.length())
                ans = ans + word2.charAt(i);
        }
        return ans;
    }
}