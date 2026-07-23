// Last updated: 7/23/2026, 2:57:33 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:nums){
            if(i!=val)
            ans.add(i);
        }
        for(int i=0;i<ans.size();i++){
            nums[i]=ans.get(i);
        }
        return ans.size();
    }
}