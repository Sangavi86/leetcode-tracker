// Last updated: 7/23/2026, 2:53:53 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII
        int length = 0;

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
            }
        }
        if (length < s.length()) {
            length += 1;
        }

        return length;
    }
}