// Last updated: 7/11/2026, 1:47:11 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}