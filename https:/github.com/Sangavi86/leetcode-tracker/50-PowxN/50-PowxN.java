// Last updated: 7/23/2026, 2:57:14 PM
class Solution {
    public double myPow(double x, int n) {

        long N = n;  // fix overflow

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }
}