// Last updated: 7/23/2026, 3:03:12 PM
import java.util.Arrays;
class Solution{
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if (n==1){
            return stones[0];
        }
        while(true){
            Arrays.sort(stones);
            int y = stones[n-1];
            int x = stones[n-2];
            if (x==0){
                return y;
            }
            stones[n - 1]=y-x;
            stones[n - 2]=0;
        }
    }
}