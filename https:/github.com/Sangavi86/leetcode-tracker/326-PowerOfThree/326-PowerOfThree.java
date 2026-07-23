// Last updated: 7/23/2026, 2:54:20 PM
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