import java.util.Scanner;

/**
Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
Here is the formula. Be careful not to use integer division!
____________________________

see equation in textbook

 */

public class Celsius {


    public static void main(String[] args) {
    double cel;
    double far;
    //int feet, inches, remainder;
    //final double CM_PER_INCH = 2.54;
    //final int IN_PER_FOOT = 12;
    Scanner in = new Scanner(System.in);

// A. prompt the user for input
System.out.print("Temperature in Celsius? ");

// B. read a double value from the keyboard
cel = in.nextDouble();

// C. calculate the result
far = (double) ((cel*(9.0/5.0)) + 32);

// D. format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
System.out.printf(cel + " C = %.1f F", far);

    }
}
