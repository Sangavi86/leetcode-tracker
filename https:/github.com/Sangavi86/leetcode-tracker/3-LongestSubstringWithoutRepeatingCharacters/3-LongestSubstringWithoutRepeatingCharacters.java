// Last updated: 7/23/2026, 2:58:10 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            String temp = "";
            for(int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(temp.indexOf(ch) == -1) {
                    temp += ch;
                    if(temp.length() > max) {
                        max = temp.length();
                    }
                }
                else {
                    break;
                }
            }
        }
        return max;
    }
}