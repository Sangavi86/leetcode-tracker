// Last updated: 8/3/2026, 2:09:45 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[k] = nums2[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
    }
}