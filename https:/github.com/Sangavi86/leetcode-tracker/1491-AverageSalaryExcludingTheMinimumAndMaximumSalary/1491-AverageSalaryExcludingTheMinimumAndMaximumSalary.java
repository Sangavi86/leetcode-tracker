// Last updated: 9/7/2026, 9:52:31 AM
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
