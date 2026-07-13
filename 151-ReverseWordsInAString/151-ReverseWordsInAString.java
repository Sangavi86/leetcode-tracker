// Last updated: 7/13/2026, 8:53:44 AM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder answer = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            answer.append(words[i]+" ");
        }
        return answer.toString().trim();
    }
}