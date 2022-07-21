import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


//PART 1 *********************************************
    SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
//PART 2 *********************************************
	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

  System.out.println();
      
	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
//PART 3 *********************************************
  System.out.println();
      
	System.out.println(ss);
	ss.sort();
  
	System.out.println(ss);

    System.out.println("Linear search found value 5 at index " + ss.linearSearch(5));

    System.out.println("Binary search found value 5 at index " + ss.binarySearch(5));

      System.out.println("Binary search found value 35 at index " + ss.binarySearch(35));

      System.out.println("Recursive Bin Search found value 5 at index " + ss.binarySearchRecursive(5, 0, 19));

            System.out.println("Recursive Bin Search found value 35 at index " + ss.binarySearchRecursive(35, 0, 19));
	
    }
}