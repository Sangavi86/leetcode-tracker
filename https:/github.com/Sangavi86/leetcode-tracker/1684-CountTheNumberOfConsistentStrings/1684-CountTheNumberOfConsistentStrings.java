// Last updated: 9/7/2026, 9:51:55 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++){
            boolean ok = true;
            for(int j=0; j<words[i].length(); j++) {
                if(allowed.indexOf(words[i].charAt(j)) == -1){
                    ok=false;
                    break;
                }
            }
            if(ok){
                count++;
            }
        }
        return count;
    }
}
