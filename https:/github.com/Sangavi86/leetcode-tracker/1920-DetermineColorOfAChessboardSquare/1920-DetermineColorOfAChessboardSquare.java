// Last updated: 7/23/2026, 3:02:20 PM
class Solution {
    public boolean squareIsWhite(String c) {
        if((c.charAt(0)+c.charAt(1))%2 !=0)
            return true;
        else return false;
    }
}