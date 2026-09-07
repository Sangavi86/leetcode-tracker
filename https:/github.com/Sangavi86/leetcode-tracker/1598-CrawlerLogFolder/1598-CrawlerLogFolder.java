// Last updated: 9/7/2026, 9:52:02 AM
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } 
            else if (log.equals("./")) {
            } 
            else {
                depth++; 
            }
        }

        return depth;
    }
}