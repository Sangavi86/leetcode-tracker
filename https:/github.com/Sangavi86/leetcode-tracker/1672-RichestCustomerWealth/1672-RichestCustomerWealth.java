// Last updated: 9/7/2026, 9:51:50 AM
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