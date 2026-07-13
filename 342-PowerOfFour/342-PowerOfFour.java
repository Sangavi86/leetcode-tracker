// Last updated: 7/13/2026, 8:52:23 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}