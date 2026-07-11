// Last updated: 7/11/2026, 1:47:02 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int operation=0;
        while(num1>0 && num2>0){
            if(num1>=num2){
                num1=num1-num2;
            }
            else{
                num2=num2-num1;
            }
            operation++;
        }
        return operation;
    }
}