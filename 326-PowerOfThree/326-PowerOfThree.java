// Last updated: 7/13/2026, 8:52:32 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}