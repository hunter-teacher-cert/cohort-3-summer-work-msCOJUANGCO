import java.io.*;
import java.util.*;

public class Time{

public static void main (String[]args){

/**output
    *A.display seconds since midnight
    *B.display seconds remaining in the day
    *C.percentage of day that has passed
    *D. Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
*/

    
//declaring + assigning  variables
double hour = 2;
double min = 42;
      
/**test
    *System.out.println(hour);
*printing time since midnight
*System.out.println("Time since midnight:");
*System.out.println(hour + " hours " + min + " minutes ");
*/
    
//calculating A.time in seconds since midnight
double SecondsPassed = ( ((hour*60.0)+min) *60.0);

//calculating B.display seconds remaining in the day
double SecondsInDay = (24.0*60.0*60.0);
double SecondsLeft= (SecondsInDay-SecondsPassed);

//calculating B.percentage of day that has passed
double PercentagePassed = ((SecondsPassed/SecondsInDay)*100.0);
    

//display calculations   
//A
System.out.println("Time (in seconds) since midnight:");
System.out.println (SecondsPassed);
System.out.println ("\r");
//B
System.out.println("Seconds left in day");
System.out.println (SecondsLeft);
System.out.println ("\r");
//C
System.out.println("Percentage of day passed");
System.out.println (PercentagePassed);
System.out.println ("\r");
//D
hour = 3.0;
min = 37.0;
double SecondsPassed2 = ( ((hour*60.0)+min) *60.0);
double ElapsedTime = (SecondsPassed2-SecondsPassed);
System.out.println("Duration of Exercise (in seconds)");
System.out.println (ElapsedTime);
    
}
}

