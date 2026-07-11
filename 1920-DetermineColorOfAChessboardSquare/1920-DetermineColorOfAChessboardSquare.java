// Last updated: 7/11/2026, 4:00:42 PM
class Solution {
    public boolean squareIsWhite(String c) {
        if((c.charAt(0)+c.charAt(1))%2 !=0)
            return true;
        else return false;
    }
}