// Last updated: 7/23/2026, 3:02:46 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                else if(i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}