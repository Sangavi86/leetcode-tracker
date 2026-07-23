// Last updated: 7/23/2026, 2:54:00 PM
class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0;i<t.length();i++) {
            char ch=t.charAt(i);
            if(s.contains(ch + "")) {
                s=s.replaceFirst(ch + "", "");
            }else{
                return ch;
            }
        }
        return ' ';
    }
}