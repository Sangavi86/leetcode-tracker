// Last updated: 8/17/2026, 11:40:37 AM
class Solution {
    public boolean consecutiveSetBits(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1'&&s.charAt(i-1)=='1'){
                count++;
            }
        }
        return count==1;
    }
}