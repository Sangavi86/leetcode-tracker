// Last updated: 7/11/2026, 4:01:21 PM
class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int digit=0;
            while(temp>0){
                temp=temp/10;
                digit++;
            }
            if(digit%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}