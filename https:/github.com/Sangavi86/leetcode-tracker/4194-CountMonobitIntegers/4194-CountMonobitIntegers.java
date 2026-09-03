// Last updated: 9/3/2026, 11:33:20 AM
class Solution {
    public int countMonobit(int n) {
        int count=1;
        int x=1;
        while(x<=n){
            count++;
            x=x*2+1;
        }
        return count;
    }
}