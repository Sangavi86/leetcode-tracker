// Last updated: 7/23/2026, 3:01:46 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mx=0;
        long mn=Integer.MAX_VALUE;
        for (int num:nums) {
            if (num>mx)mx=num;
            if (num<mn)mn=num;
        }
        return(mx-mn)*1L*k;
    }
}