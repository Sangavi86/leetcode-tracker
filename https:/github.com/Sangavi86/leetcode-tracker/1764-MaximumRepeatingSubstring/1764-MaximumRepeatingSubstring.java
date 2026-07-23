// Last updated: 7/23/2026, 3:02:31 PM
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
