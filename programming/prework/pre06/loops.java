import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

/*************************
A. CH7.9_Eyercise1 (see pdf) 

B. CH7.9_Exercise2 
C. CH7.9_Exercise3
D. CH7.9_Exercise4 
********************************/
public class loops {


public  static void main (String[]args) {

        double a; //target num (why over 2?)
        double y; //first iteration/guess
    
Scanner in = new Scanner(System.in);

//prompt user to choose target number 
System.out.println("Choose a positive whole number.");
    a = in.nextInt(); 
System.out.printf("\nOk! Let's find the square root of %2f!\n", a);

y = a/2.0;
System.out.println(squareROOT(a, y));


        double x; 
        int n;
System.out.println(power(2.0, 3));

        int z;
System.out.println(factorial(9));
    }
    

//B.*************************************    
public  static double squareROOT (double a, double y) {

            double i;  //difference        
            double sqrt;
//verify eypression
    //System.out.printf("\nFirst approyimation is: %4f.", sqrt);

    sqrt = (y+(a/y))/2.0;
    i = Math.abs(y - sqrt);

    while (i >= 0.0001) {
            sqrt = (y+(a/y))/2.0;
            System.out.println(sqrt);
            i = Math.abs(y - sqrt);
            y = sqrt;
        }
    return sqrt;
    }

    
//C.*************************************    
public static double power (double x, int n ) {

    int i=1;
    
    if (n == 0) {
        return 1;
    
    } else
        while (i <= (n-1) ) {
            i=1;
            x *= x;
            i += i;
            }
    return x;
    }

//D.*************************************    
public static int factorial (int z) {
        int prod;
        int j;

    prod =1;
    j = 1;
    
    if (z == 0) {
        return 1;
    
    } else

        while (j <= z ) {
            prod = (prod*j);
            j = j+1 ;

            }
    return prod;
    }
   
}
