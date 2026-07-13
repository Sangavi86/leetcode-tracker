// Last updated: 7/13/2026, 8:51:49 AM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int digit = num & 15; 
            result.append(hex[digit]);
            num >>>= 4; 
        }
        return result.reverse().toString();
    }
}