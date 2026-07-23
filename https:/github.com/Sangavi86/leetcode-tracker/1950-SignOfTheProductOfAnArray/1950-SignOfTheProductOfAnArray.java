// Last updated: 7/23/2026, 3:02:18 PM
class Solution {
    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                product=product*-1;
            }
        }
        return product;
    }
}