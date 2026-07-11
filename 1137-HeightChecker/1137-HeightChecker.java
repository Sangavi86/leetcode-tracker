// Last updated: 7/11/2026, 4:01:29 PM
class Solution {
    public int heightChecker(int[] heights) {
        int sol[]=heights.clone();
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sol[i]){
                count++;
            }
        }
        return count;
    }
}