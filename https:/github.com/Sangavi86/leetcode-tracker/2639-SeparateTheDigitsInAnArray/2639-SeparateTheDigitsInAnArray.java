// Last updated: 7/23/2026, 3:01:55 PM
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> seperatedDigits =new ArrayList<>();
        
        for(int i=nums.length-1;i>=0;i--){
            int n = nums[i];
            while(n!=0){
                int digit =n%10;
                seperatedDigits.add(digit);
                n/=10;
            }
        }
        int[] results=new int[seperatedDigits.size()];
        for(int i=0;i<results.length;i++){
            results[i]=seperatedDigits.get(seperatedDigits.size()-1-i);
        }
        return results;
    }
}