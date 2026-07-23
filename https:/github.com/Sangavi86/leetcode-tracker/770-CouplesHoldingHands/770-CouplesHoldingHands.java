// Last updated: 7/23/2026, 3:04:11 PM
class Solution{
    public int minSwapsCouples(int[] row){
        int n=row.length;
        int[] pos=new int[n];
        for(int i=0;i<n;i++)pos[row[i]]=i;
        int ans=0;
        for(int i=0;i<n;i+=2){
            int first=row[i];
            int expected=first^1;
            if(row[i+1]!=expected){
                ans++;
                int partnerPos=pos[expected];
                pos[row[i+1]]=partnerPos;
                pos[expected]=i+1;
                int temp=row[i+1];
                row[i+1]=row[partnerPos];
                row[partnerPos]=temp;
            }
        }
        return ans;
    }
}
