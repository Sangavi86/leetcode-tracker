// Last updated: 7/23/2026, 2:53:39 PM
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0; 
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++; 
            }
            j++; 
        }
        return i; 
    }
}