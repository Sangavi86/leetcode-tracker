// Last updated: 7/13/2026, 8:53:28 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int []temp=new int[n];
        k=k%n;
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }
        for(int i=k;i<n;i++){
            temp[i]=nums[i-k];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}