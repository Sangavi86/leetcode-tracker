// Last updated: 7/23/2026, 3:03:36 PM
import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}