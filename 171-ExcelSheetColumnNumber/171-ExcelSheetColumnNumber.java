// Last updated: 7/13/2026, 8:53:35 AM
class Solution {
    public int titleToNumber(String str) {
        int res=0;
        for(char i: str.toCharArray()){
            res= res*26+(i-'A'+1);
        }
    return res;
    }
}