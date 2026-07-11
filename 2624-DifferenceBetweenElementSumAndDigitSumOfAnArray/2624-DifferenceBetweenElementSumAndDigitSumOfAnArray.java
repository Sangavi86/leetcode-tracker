// Last updated: 7/11/2026, 1:46:55 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int n=nums[i];
        while(n>0){
            digit=digit + n%10;
            n=n/10;
        }
        }
        if(sum>digit)
            return sum-digit;
        else{
            return digit-sum;
        }
    }
}