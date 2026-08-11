// Last updated: 8/11/2026, 5:54:08 PM
class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        int late=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'){
                absent++;
                late=0;
            }
            else if(ch=='L'){
                late++;
            }
            else{
                late=0;
            }
            if(absent>=2||late>=3){
                return false;
            }
        }
        return true;
    }
}