// Last updated: 9/7/2026, 9:51:31 AM
class Solution {
    public boolean squareIsWhite(String c) {
        if((c.charAt(0)+c.charAt(1))%2 !=0)
            return true;
        else return false;
    }
}