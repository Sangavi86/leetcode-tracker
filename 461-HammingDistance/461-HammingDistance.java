// Last updated: 7/13/2026, 8:51:11 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;  
        int count = 0;
        while (xor != 0) {
            count += xor & 1;  
            xor >>= 1;     
        }
        return count;
    }
}