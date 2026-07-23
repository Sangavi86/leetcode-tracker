// Last updated: 7/23/2026, 2:54:02 PM
class Solution {
    public int firstUniqChar(String str) {
        int arr[] = new int[26];
        for (int i=0; i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==1) return i;
        }
        return -1; 
    }
}