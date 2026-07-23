// Last updated: 7/23/2026, 2:57:49 PM
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        String[] map = {
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        result.add(""); 
        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = map[digit - '0'];
            for (String combination : result) {
                for (char c : letters.toCharArray()) {
                    temp.add(combination + c);
                }
            }
            result = temp; 
        }

        return result;
    }
}