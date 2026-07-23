// Last updated: 7/23/2026, 3:02:28 PM
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
