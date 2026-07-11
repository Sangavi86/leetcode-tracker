// Last updated: 7/11/2026, 4:03:19 PM
import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean flag = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || i % digit != 0) {
                    flag = false;
                    break;
                }
                temp = temp / 10;
            }
            if (flag) {
                ans.add(i);
            }
        }
        return ans;
    }
}