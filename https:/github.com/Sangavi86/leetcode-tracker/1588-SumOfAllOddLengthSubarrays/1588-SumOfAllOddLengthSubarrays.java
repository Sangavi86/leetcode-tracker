// Last updated: 9/7/2026, 9:52:16 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // check odd length
                if ((j - i + 1) % 2 == 1) {
                    int sum = 0;

                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }

                    totalSum += sum;
                }
            }
        }

        return totalSum;
    }
}