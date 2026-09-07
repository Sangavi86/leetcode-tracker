// Last updated: 9/7/2026, 9:51:27 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int ascii=97;ascii<=122;ascii++){
            if(sentence.indexOf((char)ascii)==-1){
                return false;
            }
        }
    return true;
    }
}