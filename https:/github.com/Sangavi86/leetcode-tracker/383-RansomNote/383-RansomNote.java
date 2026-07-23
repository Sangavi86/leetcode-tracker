// Last updated: 7/23/2026, 3:05:59 PM
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