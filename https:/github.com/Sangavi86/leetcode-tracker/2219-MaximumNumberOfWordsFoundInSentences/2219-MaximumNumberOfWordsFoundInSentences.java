// Last updated: 7/23/2026, 3:02:09 PM
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
