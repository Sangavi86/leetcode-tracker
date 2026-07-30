// Last updated: 7/30/2026, 11:07:30 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String words[]=s.split(" ");
4        return words[words.length-1].length();
5    }
6}