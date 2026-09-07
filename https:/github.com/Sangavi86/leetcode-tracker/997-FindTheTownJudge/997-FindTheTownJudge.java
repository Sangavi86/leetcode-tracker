// Last updated: 9/7/2026, 9:53:20 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        for(int person=1;person<=n;person++){
            int tcount=0;
            boolean ts=false;
            for(int i=0;i<trust.length;i++){
                if(trust[i][0]==person){
                    ts=true;
                }
                if(trust[i][1]==person){
                    tcount++;
                }
            }
            if(!ts&&tcount==n-1){
                return person;
            }
        }
        return -1;
    }
}