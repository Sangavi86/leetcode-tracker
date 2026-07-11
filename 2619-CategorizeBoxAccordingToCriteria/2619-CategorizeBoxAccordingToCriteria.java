// Last updated: 7/11/2026, 1:46:57 PM
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Bulky=false;
        boolean Heavy=false;
        long volume = 1L* length * height * width;
        if(length >= 10000 || width >= 10000 || height >= 10000 || volume >=1000000000){
            Bulky=true;
        }
        if(mass>=100){
            Heavy=true;
        }
        if(Bulky && Heavy){
            return "Both";
        } 
        else if(Bulky){
            return "Bulky";
        } 
        else if(Heavy){
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}    
