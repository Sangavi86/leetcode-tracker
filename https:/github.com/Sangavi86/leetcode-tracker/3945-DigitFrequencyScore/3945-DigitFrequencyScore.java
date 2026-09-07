// Last updated: 9/7/2026, 9:50:07 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
}