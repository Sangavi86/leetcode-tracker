// Last updated: 7/13/2026, 8:53:08 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0 || n<=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}