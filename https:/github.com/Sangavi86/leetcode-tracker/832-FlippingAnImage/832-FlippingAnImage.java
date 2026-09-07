// Last updated: 9/7/2026, 9:54:15 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int left = 0, right = image[i].length - 1;
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = (image[i][j] == 0) ? 1 : 0;
            }
        }

        return image;
    }
}