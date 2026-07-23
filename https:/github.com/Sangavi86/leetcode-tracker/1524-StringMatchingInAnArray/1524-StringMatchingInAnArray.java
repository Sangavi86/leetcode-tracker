// Last updated: 7/23/2026, 3:02:53 PM
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // Skip if same word
                if (i == j) continue;
                // Check if words[i] is a substring of words[j]
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // no need to check other words once found
                }
            }
        }
        return result;
    }
}
