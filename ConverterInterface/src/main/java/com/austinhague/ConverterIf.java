package com.austinhague;

public class ConverterIf {

    String[] monthArray = {"January","February","March","April","May", "June", "July", "August", "September", "October", "November", "December"};
    public String convertMonth(int monthNum) {
        // if monthNum is less than or equal to 12
        if(monthNum <= 12 && monthNum >= 1){
            return "The corresponding month to the input number "+ monthNum + " is " + monthArray[monthNum-1] + ".";
        }else{
            return "Error that is not a alphanumerical Month.";
        }
    }
}
