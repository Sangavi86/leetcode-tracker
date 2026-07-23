// Last updated: 7/23/2026, 2:54:09 PM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}