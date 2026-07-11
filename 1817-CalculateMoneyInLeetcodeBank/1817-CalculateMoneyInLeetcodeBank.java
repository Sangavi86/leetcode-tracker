// Last updated: 7/11/2026, 4:00:46 PM
class Solution{
    public int totalMoney(int n){
        int money=0;
        int monday=1;
        int today=1;
        for (int i=1;i<=n;i++){
            money+=today;
            today++;
            if(i%7==0){
                monday++;
                today=monday;
            }
        }
        return money;
    }
}