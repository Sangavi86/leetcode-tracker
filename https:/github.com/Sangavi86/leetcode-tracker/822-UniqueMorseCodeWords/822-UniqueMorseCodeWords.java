// Last updated: 7/23/2026, 3:04:01 PM
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