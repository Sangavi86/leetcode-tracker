// Last updated: 7/11/2026, 4:00:53 PM
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