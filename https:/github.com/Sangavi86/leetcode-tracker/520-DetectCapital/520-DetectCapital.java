// Last updated: 8/13/2026, 11:22:28 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if(count==word.length()){
            return true;
        }
        if(count==0){
            return true;
        }
        if(count==1&&Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}