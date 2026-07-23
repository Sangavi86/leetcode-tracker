// Last updated: 7/23/2026, 3:04:53 PM
import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;

                    if (sum < minSum) {
                        minSum = sum;
                        result.clear();
                        result.add(list1[i]);
                    } else if (sum == minSum) {
                        result.add(list1[i]);
                    }
                }
            }
        }

        return result.toArray(new String[0]);
    }
}