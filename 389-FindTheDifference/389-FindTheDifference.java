// Last updated: 7/13/2026, 8:51:56 AM
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