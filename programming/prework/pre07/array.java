import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;


/*************************
A. powArray 
B. histogram
********************************/
public class array {

public static void main(String[] args) {
        double [] a = {2,3,4};//enter values here
        double power;
        power = 3.0;
    
    powArray (a,power);
    }

//A. powArray
public static void powArray(double [] a,double power) {

    for (int i = 0; i < a.length; i++) {
        double result;
        result = a[i]*power;
        System.out.println(result);
        }


    }

//B. histogram
public static void histogram(double [] a,double power) {

    for (int i = 0; i < a.length; i++) {
        double result;
        result = a[i]*power;
        System.out.println(result);
        }


    }




    
}
