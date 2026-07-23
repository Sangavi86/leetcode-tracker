// Last updated: 7/23/2026, 3:01:47 PM
public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0; // This will store the number of pairs found
        
        // Check every pair where i < j
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String first = words[i];
                String second = words[j];
                
                // Check if 'first' is a prefix of 'second'
                boolean isPrefix = second.startsWith(first);
                
                // Check if 'first' is a suffix of 'second'
                boolean isSuffix = second.endsWith(first);
                
                // If both prefix and suffix are true, increase count
                if (isPrefix && isSuffix) {
                    count++;
                }
            }
        }
        
        return count; // Return the final count
    }
}
