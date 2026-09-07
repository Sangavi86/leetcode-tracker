// Last updated: 9/7/2026, 9:52:06 AM
class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') spaceCount++;
        }
        String[] words = text.trim().split("\\s+");
        int n = words.length;
        if (n == 1) {
            return words[0] + " ".repeat(spaceCount);
        }

        int spacesBetween = spaceCount / (n - 1);
        int extraSpaces = spaceCount % (n - 1);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(words[i]);

            if (i != n - 1) {
                result.append(" ".repeat(spacesBetween));
            }
        }
        result.append(" ".repeat(extraSpaces));

        return result.toString();
    }
}