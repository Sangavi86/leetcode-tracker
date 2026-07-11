// Last updated: 7/11/2026, 4:00:51 PM
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
