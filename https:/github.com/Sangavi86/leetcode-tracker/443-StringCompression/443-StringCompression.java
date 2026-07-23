// Last updated: 7/23/2026, 2:53:42 PM
class Solution {
    public int compress(char[] chars) {
        String ans = "";
        for (int i=0;i<chars.length;) {
            char ch=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==ch) {
                count++;
                i++;
            }
            ans=ans+ch;
            if(count>1){
                ans=ans+count;
            }
        }
        for(int i=0;i<ans.length();i++){
            chars[i]=ans.charAt(i);
        }
        return ans.length();
    }
}