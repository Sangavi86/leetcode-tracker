// Last updated: 7/23/2026, 3:03:56 PM
import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        String result = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                
                if (map.get(word) > maxCount) {
                    maxCount = map.get(word);
                    result = word;
                }
            }
        }
        
        return result;
    }
}