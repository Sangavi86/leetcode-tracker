// Last updated: 7/23/2026, 2:57:20 PM
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }
}