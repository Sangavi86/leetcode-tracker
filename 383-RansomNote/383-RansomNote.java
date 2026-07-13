// Last updated: 7/13/2026, 8:52:06 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(magazine.contains(ch+"")){
                magazine=magazine.replaceFirst(ch+"","");
            }
            else{
                return false;
            }
        }
        return true;
    }
}