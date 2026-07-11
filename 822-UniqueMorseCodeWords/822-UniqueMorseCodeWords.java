// Last updated: 7/11/2026, 4:02:48 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String>set=new HashSet<>();
        for(String word:words){
            String code="";
            for(char ch:word.toCharArray()){
                code+=morse[ch-'a'];
            }
            set.add(code);
        }
        return set.size();
    }
}