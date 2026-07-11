// Last updated: 7/11/2026, 1:46:53 PM
class Solution {
    public int passThePillow(int n, int time) {
        int turn=((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        return (turn-time+1);
    }
}