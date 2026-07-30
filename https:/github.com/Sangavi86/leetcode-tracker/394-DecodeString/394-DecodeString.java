// Last updated: 7/30/2026, 10:59:17 AM
class Solution {
    int i = 0;
    public String decodeString(String s) {
        String ans = "";
        while (i < s.length() && s.charAt(i) != ']') {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                ans += ch;
                i++;
            } else {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++; 
                String temp = decodeString(s);
                i++; 
                for (int j = 0; j < num; j++) {
                    ans += temp;
                }
            }
        }
        return ans;
    }
}