// Last updated: 7/23/2026, 2:58:07 PM
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String[] arr = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = "";
        }
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            arr[row] += s.charAt(i);
            if (row == 0) {
                down = true;
            }
            if (row == numRows - 1) {
                down = false;
            }
            if (down) {
                row++;
            } else {
                row--;
            }
        }
        String ans = "";
        for (int i = 0; i < numRows; i++) {
            ans += arr[i];
        }
        return ans;
    }
}