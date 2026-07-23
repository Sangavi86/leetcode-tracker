// Last updated: 7/23/2026, 3:02:58 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        hour=hour%12;
        double hourAngle=hour*30+minutes*0.5;
        double minutesAngle=minutes*6;
        double angle;
        if(hourAngle>minutesAngle){
            angle=hourAngle-minutesAngle;
        }
        else{
            angle=minutesAngle-hourAngle;
        }
        if(angle>180){
            angle=360-angle;
        }
        return angle;
    }
}