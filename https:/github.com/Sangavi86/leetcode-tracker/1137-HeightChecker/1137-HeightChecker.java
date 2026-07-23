// Last updated: 7/23/2026, 3:03:10 PM
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