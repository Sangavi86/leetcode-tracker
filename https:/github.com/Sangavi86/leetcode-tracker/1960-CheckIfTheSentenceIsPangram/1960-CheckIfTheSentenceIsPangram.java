// Last updated: 7/23/2026, 3:02:17 PM
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