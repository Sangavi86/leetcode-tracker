// Last updated: 7/23/2026, 3:02:51 PM
class Solution{
    public double average(int[] salary){
        int min=salary[0];
        int max=salary[0];
        int sum=0;
        for(int i=0;i<salary.length;i++){
            int c=salary[i];
            sum=sum+c;
            if(c<min){
                min=c;
            }
            if(c>max){
                max=c;
            }
        }
        sum=sum-min;
        sum=sum-max;
        int count=salary.length-2;
        double average=(double)sum/count;
        return average;
    }
}
