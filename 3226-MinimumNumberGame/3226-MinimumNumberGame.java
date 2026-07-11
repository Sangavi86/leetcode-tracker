// Last updated: 7/11/2026, 1:46:49 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int point=0;
        for(int i=0;i<nums.length;i=i+2){
            int alice=nums[i];
            int bob=nums[i+1];
            arr[point]=bob;
            point++;
            arr[point]=alice;
            point++;
        }
        return arr;
    }
}