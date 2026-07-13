// Last updated: 7/13/2026, 8:53:38 AM
class Solution {
    public String convertToTitle(int n) {
          StringBuilder ans=new StringBuilder();
          while(n>0){
            n--;
            int r=n%26;
            ans.append((char)(r+'A'));
            n/=26;
          }
          return ans.reverse().toString();

    }
}