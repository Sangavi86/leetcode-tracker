// Last updated: 7/11/2026, 1:47:15 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int []answer=new int[2*nums.length];
        for(int i =0;i<nums.length;i++){
            answer[i]=nums[i];
        }
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            answer[index]=nums[i];
            index++;
        }
        return answer;
    }
}