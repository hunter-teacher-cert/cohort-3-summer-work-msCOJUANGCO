import java.io.*;
import java.util.*;

public class Date{

public static void main (String[]args){

//output, sample
    //American format:
    //Thursday, July 16, 2015
    //European format:
    //Thursday 16 July 2015

//declaration of variables
String day;
int date;

//assigning  variables
day = "Monday";
date = 4;

//declaring + assigning  variables
String month = "April";
int year = 2022;    


//printing variables, test
    //System.out.println(day);
    //System.out.println(date);

//printing variables
System.out.println("American format:");
System.out.println(day + ", " + month + " " + date + ", " + year);

System.out.println("European format:");
System.out.println(day + " " + date + " " + month + " " + year);
    
}
}

