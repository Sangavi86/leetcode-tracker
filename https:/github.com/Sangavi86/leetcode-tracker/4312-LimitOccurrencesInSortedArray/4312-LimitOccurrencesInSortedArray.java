// Last updated: 8/17/2026, 11:26:14 AM
class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int index=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=k){
                nums[index]=nums[i];
                index++;
            }
        }
        return Arrays.copyOf(nums, index);
    }
}