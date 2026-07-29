// Last updated: 7/29/2026, 4:27:48 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] arr = new int[nums1.length + nums2.length];
4        int k = 0;
5        for (int i = 0; i < nums1.length; i++) {
6            arr[k] = nums1[i];
7            k++;
8        }
9        for (int i = 0; i < nums2.length; i++) {
10            arr[k] = nums2[i];
11            k++;
12        }
13        for (int i = 0; i < arr.length; i++) {
14            for (int j = i + 1; j < arr.length; j++) {
15                if (arr[i] > arr[j]) {
16                    int temp = arr[i];
17                    arr[i] = arr[j];
18                    arr[j] = temp;
19                }
20            }
21        }
22        int n = arr.length;
23        if (n % 2 == 1) {
24            return arr[n / 2];
25        } else {
26            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
27        }
28    }
29}