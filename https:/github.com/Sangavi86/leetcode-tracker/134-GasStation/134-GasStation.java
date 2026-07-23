// Last updated: 7/23/2026, 2:55:59 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            int ans=gas[i]-cost[i];
            total+=ans;
            tank+=ans;
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return start;
    }
}