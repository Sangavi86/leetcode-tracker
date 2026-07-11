// Last updated: 7/11/2026, 4:03:26 PM
class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int left = 1;
        int right = n;
        int index = 0;
        while(left<=right){
            if (k > 1) {
                if (k % 2 == 1) {
                    ans[index++] = left++;
                } else {
                    ans[index++] = right--;
                }
                k--;
            } else {
                ans[index++] = left++;
            }
        }
        return ans;
    }
}