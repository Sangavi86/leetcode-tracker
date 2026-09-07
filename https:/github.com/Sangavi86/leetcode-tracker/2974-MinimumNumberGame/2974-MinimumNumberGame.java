// Last updated: 9/7/2026, 9:50:39 AM
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