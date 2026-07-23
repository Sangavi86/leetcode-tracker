// Last updated: 7/23/2026, 2:54:07 PM
public class Solution extends GuessGame {

    public int guessNumber(int n) {

        int low = 1, high = n;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int res = guess(mid);

            if (res == 0) return mid;
            else if (res == -1) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}