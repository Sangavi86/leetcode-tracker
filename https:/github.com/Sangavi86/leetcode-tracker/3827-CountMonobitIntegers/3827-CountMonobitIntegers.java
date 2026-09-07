// Last updated: 9/7/2026, 9:50:09 AM
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