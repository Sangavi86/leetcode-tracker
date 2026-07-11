// Last updated: 7/11/2026, 4:03:55 PM
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int gap=timeSeries[i+1]-timeSeries[i];
            ans+=Math.min(duration,gap);
        }
        return ans+duration;
    }
}