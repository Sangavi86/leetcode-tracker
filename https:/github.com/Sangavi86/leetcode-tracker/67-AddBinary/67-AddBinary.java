// Last updated: 7/23/2026, 2:57:05 PM
class Solution {
    public String addBinary(String a,String b) {
        StringBuilder result=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0) {
            int digitA=0;
            if(i>=0) {
                digitA=a.charAt(i)-'0';
            }
            int digitB=0;
            if(j>=0) {
                digitB=b.charAt(j)-'0';
            }
            int sum=digitA+digitB+carry;
            if(sum==0) {
                result.append("0");
                carry=0;
            } else if(sum==1) {
                result.append("1");
                carry=0;
            } else if(sum==2) {
                result.append("0");
                carry=1;
            } else if(sum==3) {
                result.append("1");
                carry=1;
            }
            i=i-1;
            j=j-1;
        }
        result.reverse();
        return result.toString();
    }
}
