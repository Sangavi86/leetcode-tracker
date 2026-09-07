// Last updated: 9/7/2026, 9:51:59 AM
public class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String repeatedWord = word;
        while (sequence.contains(repeatedWord)) {
            k++;
            repeatedWord += word;
        }
        return k;
    }
}
