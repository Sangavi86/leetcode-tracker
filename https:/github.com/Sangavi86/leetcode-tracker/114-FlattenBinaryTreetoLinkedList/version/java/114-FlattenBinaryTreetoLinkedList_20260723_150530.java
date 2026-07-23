// Last updated: 7/23/2026, 3:05:30 PM
1class Solution {
2    int i = 0;
3    public String decodeString(String s) {
4        String ans = "";
5        while (i < s.length() && s.charAt(i) != ']') {
6            char ch = s.charAt(i);
7            if (Character.isLetter(ch)) {
8                ans += ch;
9                i++;
10            } else {
11                int num = 0;
12                while (Character.isDigit(s.charAt(i))) {
13                    num = num * 10 + (s.charAt(i) - '0');
14                    i++;
15                }
16                i++; 
17                String temp = decodeString(s);
18                i++; 
19                for (int j = 0; j < num; j++) {
20                    ans += temp;
21                }
22            }
23        }
24        return ans;
25    }
26}