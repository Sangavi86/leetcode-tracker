// Last updated: 9/7/2026, 9:54:51 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                if (ch == jewels.charAt(j)) {
                    count++;
                    break; 
                }
            }
        }

        return count;
    }
}