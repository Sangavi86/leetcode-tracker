// Last updated: 7/23/2026, 2:54:59 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int digit=0;
            while(num>0){
                digit=digit + num%10;
                num=num/10;
            }
            num=digit;
        }
    return num;   
    }
}