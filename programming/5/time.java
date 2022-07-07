import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * First Last
 * collaborators: Will L., Latoya B., Nicole C.
 */

/**

INSTRUCTIONS:
   This file contains the starter code for our Time class.
   The class here uses ints for hours, minutes, and seconds but you
   could decide to change the internal representation to just store
   an int representing a number of seconds.
   Place this file in a folder named programming/5/Time.java
   Basic level (complete all):
   - public Time(int hrs, int mins, int secs) - constructor X
   - public void toString() Can be done next X
   - public void set(int hrs, int mins, int secs) Or can be done x
   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)
   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    int hours;
    int minutes;
    int seconds;

    // Constructors
    public Time(){
	    this.hours = 0;
	    this.minutes = 0;
	    this.seconds = 0;
	
    }

    /**
       Parameters:
       - hrs, mins, secs - the time you want to create the class as
       Initialize this instance to represent hrs:mins:secs as the time.
       
     */
    public Time(int hrs, int mins, int secs){
      // purpose of the constructor is to get things in from the outside
      hours = hrs;
      minutes = mins;
      seconds = secs;
      // set(hrs, mins, secs);
	
    }
    
    
    // Methods

    /**
      returns a string representation of the time
      modifies this instance to represent the time hrs:mins:secs
      it sort of seems like they actually wanted 00:00:00
    */
    public String toString(){
      // formating up here so the return isn't super long (for readability)
      String hnum = String.format("%02d", hours);
      String mnum = String.format("%02d", minutes);
      String snum = String.format("%02d", seconds);
      
	    return "" + hnum + ":" + mnum + ":" +snum;
    }


    

    /**
       Parameters:
       - hrs,mins,secs - ints representing a time
       
    */
    public void set(int hrs, int mins, int secs){
      hours = hrs;
      minutes = mins;
      seconds = secs;
    }

    

    /**
       Parameters:
       - other - a variable of type Time
       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	    // add the code to add the time represented by other
	    // to this instance.

    }


  /**
     Parameters:
     other - a variable of type Time
     Returns:
     True if this instance and other represents the same time
     false otherwise.
  */
  public boolean equals(Time other){
	  // your code here)

	  return false; // change this
  }

  /**
     Parameters:
     other - a variable of type Time
     Returns:
     A positive number if this instance represents a time greater
     than the time of other (this > other)
     A negative number if this instance represents a time less
     than the time of other (this < other)
     0 if the two instances represent the same time.
  */
  public int compareTo(Time other){
	  // your code here)

	  return 0; // change this
  }
    

    
}//end class