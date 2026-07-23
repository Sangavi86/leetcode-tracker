// Last updated: 7/23/2026, 3:01:54 PM
class Solution {
    public int passThePillow(int n, int time) {
        int turn=((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        return (turn-time+1);
    }
}