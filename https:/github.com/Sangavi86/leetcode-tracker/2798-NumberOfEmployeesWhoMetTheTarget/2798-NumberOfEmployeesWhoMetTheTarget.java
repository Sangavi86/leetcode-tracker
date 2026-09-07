// Last updated: 9/7/2026, 9:50:42 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int count=0;
       for(int i=0;i<hours.length;i++){
        if(hours[i]>=target){
            count++;
        }
       } 
       return count;
    }
}