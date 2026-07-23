// Last updated: 7/23/2026, 3:02:35 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String str1="";
       String str2="";
       for(String str:word1){
        str1+=str;
       }
       for(String str:word2){
        str2+=str;
       }
       return str1.equals(str2);
    }
}