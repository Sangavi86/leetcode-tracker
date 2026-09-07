// Last updated: 9/7/2026, 9:53:09 AM
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