// Last updated: 7/11/2026, 1:47:06 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            int wordCount = sentence.split(" ").length;
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        return maxWords;
    }
}
