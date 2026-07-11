// Last updated: 7/11/2026, 4:00:47 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0; j<accounts[i].length;j++){
                wealth=wealth+accounts[i][j];
            }
            if(wealth>max){
                max=wealth;
            }
        }
        return max;
    }
}