import java.io.*;
import java.util.*;

/**
SortSearch.java
Owner: Théa W.
Collaborators: Adam P., Ben E., Kiana H. 
Group 5
Dates: 7/18/22, 7/19/22, 7/20/22
**/

/*
Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.- DONE
  2. Compile and run the program (SortSearchDriver.java and SortSearch.java) and confirm
  the behavior of the constructors.- DONE
  
Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.- DONE
  2. Uncomment the lines in SortSearchDriver to test.- DONE
  
Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description - DONE
  2. Uncomment the lines in SortSearchDriver to test. - DONE

Search Project:
  1. Complete the linear search (BASIC) - DONE
  2. Complete the binary search (Intermediate) - DONE
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; //variable to hold a randomly generated object.

    
    public SortSearch()//constructor that has no parameters
    {
    	data = new ArrayList<Integer>();//initializes the instance variable "data"
    	r = new Random();//initializes the instance variable "r".
    	for (int i=0; i<15; i++) //default size is 15
      {
    	  data.add(r.nextInt(20)); //the parameter "20" fills with random values between 0 and 19
    	}
	
    }
    
    public SortSearch(int size)//overloaded constructor that takes in an int "size"
    {
    	data = new ArrayList<Integer>();//initializes the instance variable "data"
    	r = new Random();//initializes the instance variable "r".
    	for (int i=0; i<size; i++)//size is provided by the user through through the varialbe "size"
      {
    	  data.add(r.nextInt(20));//the parameter "20" fills with random values between 0 and 19
    	}
	
    }

      public SortSearch(int size, int foo)//overloaded constructor that takes in an int "size". foo int does nothing. We added this just to be able to use this constructor to create larger sorter arrays.
    {
    	data = new ArrayList<Integer>();//initializes the instance variable "data"
    	
    	for (int i=0; i<size; i++)//size is provided by the user through through the varialbe "size"
      {
    	  data.add(i);//this makes it so that the data at i will equal value
    	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start)
    {
    	int smallIndex = start;
      for(int i = start; i < data.size(); i++)
      {
        if(data.get(i) < data.get(smallIndex))
        {
          smallIndex = i;
        }
      }	//ends the for loop
    	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
       
    */
    public void sort()
    {
      for(int i = 0; i < data.size(); i++)
      {
        int smallest = findSmallestIndex(i); //we call the method "findSmallestIndex, which finds the index that contains the smallest element(value) and stores the index (#) of that smallest element in the variable "smallest" which outside the arraylist.
        
        int temp = data.get(smallest); //takes the value of the element in smallest and saves it to a temporary variable, outside the arraylist, called "temp".
        
        data.set(smallest,data.get(i)); //gets the value of the element at position "i" and moves it (overwrites the data) at smallest.
       
        data.set(i,temp); //sets the value of the element at index i to the value currently in the variable temp.
        
      } // ends the for loop


    } // ends the sort method



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value)
    {
      for(int i = 0; i < data.size(); i++) //traverses the array list from beginning to end
      {
        if (data.get(i) == value) // hanging if, only happens IF there is no ELSE
        {
          return i; //returns the first occurence of "value"
        }
        
      } // ends the for loop

      // The area down here works like an ELSE
	
	    return -1; // returns -1 if "value" is not found in the arraylist.
    }
    
    /**
       Implement a binary search as specified by the comments
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value)
    {

	    // create assign variables  representing the high, low and middle indices 
      
      int low = 0;
      int high = data.size()-1;
      int middle = (low + high)/2;
      
   	  // while we're not done:
      while(true)
      {
	    //   if the item is at data.get(middle), return middle
        if (data.get(middle) == value)
        {
          return middle; // the value defined in the main is found 
        }
	      
        else if (high <= low)//   edge case, if the value is not found, this will break out of the loop. Otherwise, it will go to the else cases below (update high, low, and middle).
        {
          return -1; // not found in the arraylist
        }
        else if(value < data.get(middle))
        {
          high = middle - 1; // sets the "high" index to the one below the old "middle" index.This adjustment happens if necessary.
        }
        else
        {
          low = middle + 1; // sets the "low" index to the one above the old "middle" index.This adjustment happens if necessary.
        }
        middle = (low + high) / 2;
      }	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex)
  {
		  // if high and low have not met yet
      if(lowIndex <= highIndex)
      
      {
      // set a mid to the middle of highIndex and lowIndex
      int middle = (lowIndex + highIndex) / 2;
      
      // return the middle if we found the value
      if (value == data.get(middle))
      {
        return middle;
      }

      // if the mid is less than the value search high
      if (value > data.get(middle))
      {
        return binarySearchRecursive(value, middle +1, highIndex);
      }
      // if the mid is more than the value search low
      if (value < data.get(middle))
      {
        return binarySearchRecursive(value, lowIndex, middle -1);
      }
    }
      
	  return -1; // return the base case that it is not found
    }
    
	
    public String toString(){
	    return ""+data;
    }


    public void builtinSort(){
	    Collections.sort(data);
	
    }
    /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){

	// code for merge
	
	return new ArrayList<Integer>(); // replace this line
    }

    
}