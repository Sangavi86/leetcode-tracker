// Last updated: 7/13/2026, 8:51:12 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String sub = s.substring(0, len);
                String formed = "";
                for (int i = 0; i < n / len; i++) {
                    formed += sub;
                }
                if (formed.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}