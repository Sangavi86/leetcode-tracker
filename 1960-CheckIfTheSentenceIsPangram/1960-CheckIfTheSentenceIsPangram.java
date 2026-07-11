// Last updated: 7/11/2026, 4:00:40 PM
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