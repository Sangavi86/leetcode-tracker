// Last updated: 9/7/2026, 9:54:06 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length -1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}