package com.austinhague;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class ConverterTest {
    public static class ApplicationTest {
        private ConverterIf ConverterMonth;
        private ConverterSwitch ConverterDay;

        @Before
        public void setup() {
            ConverterMonth = new ConverterIf();
            ConverterDay = new ConverterSwitch();

        }

        @Test
        public void shouldConvertMonth(){
            // Arrange
            String expected = "The corresponding month to the input number 1 is January.";
            int monthNum = 1;
            // Act
            String result = ConverterMonth.convertMonth(monthNum);
            // Assert
            assertEquals(expected, result);
            // Arrange
            String expected2 = "The corresponding month to the input number 7 is July.";
            int monthNum2 = 7;
            // Act
            String result2 = ConverterMonth.convertMonth(monthNum2);
            // Assert
            assertEquals(expected2, result2);
        }
        @Test
        public void shouldConvertDay(){
            // Arrange
            String expected = "The corresponding day to the input number 3 is Tuesday.";
            int dayNum = 3;
            // Act
            String result = ConverterDay.convertDay(dayNum);
            // Assert
            assertEquals(expected, result);
            // Arrange
            String expected2 = "The corresponding day to the input number 7 is Saturday.";
            int dayNum2 = 7;
            // Act
            String result2 = ConverterDay.convertDay(dayNum2);
            // Assert
            assertEquals(expected2, result2);
        }
        @Test
        public void shouldReturnErrorIfNegativeNumberOrZeroMonth(){
            // Arrange
            String expected = "Error that is not a alphanumerical Month.";
            int monthNum = 0;
            // Act
            String result = ConverterMonth.convertMonth(monthNum);
            // Assert
            assertEquals(expected, result);
        }
        @Test
        public void shouldReturnErrorIfNegativeNumberDay(){
            // Arrange
            String expected = "Error that is not a alphanumerical Day.";
            int dayNum = -1;
            // Act
            String result = ConverterDay.convertDay(dayNum);
            // Assert
            assertEquals(expected, result);
        }
    }
}


  
