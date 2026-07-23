// Last updated: 7/23/2026, 3:02:43 PM
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