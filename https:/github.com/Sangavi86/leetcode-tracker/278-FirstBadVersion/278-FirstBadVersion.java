// Last updated: 7/23/2026, 2:54:53 PM
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low<high) {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)) {
                high=mid;
            }else{
                low=mid + 1;
            }
        }
        return low;
    }
}