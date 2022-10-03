package com.austinhague;

public class ConverterApplication {
    public static void main(String[] args) {
         ConverterIf converterMonth = new ConverterIf();
         ConverterSwitch converterDay = new ConverterSwitch();

        // Execute Methods for Calculator
        /**
         * This method converts the given number into its corresponding month.
         * @param monthNumber&mdash;the number you wish to convert to a month
         * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
         */
        System.out.println(converterMonth.convertMonth( 6));
        /**
         * This method converts the given number into its corresponding day of the week.
         * @param dayNumber&mdash;number you wish to convert to a day of the week
         * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
         * The first day of the week is Sunday
         */
        System.out.println(converterDay.convertDay(4));
    }
}
