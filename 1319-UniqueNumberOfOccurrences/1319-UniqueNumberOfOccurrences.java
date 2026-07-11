// Last updated: 7/11/2026, 4:01:25 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean counted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    counted = true;
                    break;
                }
            }
            if (!counted) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                freq[index++] = count;
            }
        }
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (freq[i] == freq[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}