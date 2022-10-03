package com.austinhague;


public class ConverterSwitch {
    public String convertDay(int dayNum) {
        String[] dayArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // String message = "The corresponding day to the input number " + dayNum + " is " + dayArray[dayNum - 1] + ".";
        // Hardcoded Switch Statement
        switch (dayNum) {
            case 1:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[0] + ".";
            case 2:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[1] + ".";
            case 3:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[2] + ".";
            case 4:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[3] + ".";
            case 5:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[4] + ".";
            case 6:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[5] + ".";
            case 7:
                return "The corresponding day to the input number " + dayNum + " is " + dayArray[6] + ".";
            default:
                return "Error that is not a alphanumerical Day.";
        }
//          Not hardcoded Switch Statement
//          switch (dayNum) {
//              case 1:
//                  return message;
//              case 2:
//                  return message;
//              case 3:
//                  return message;
//              case 4:
//                  return message;
//              case 5:
//                  return message;
//              case 6:
//                  return message;
//              case 7:
//                  return message;
//              default:
//                  return "Error that is not a alphanumerical Day.";
//          }
    }
}