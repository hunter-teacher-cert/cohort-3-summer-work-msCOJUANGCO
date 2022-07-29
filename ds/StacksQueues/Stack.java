import java.util.*;

public class Stack{
  
  // Place private instance variables here
   
  private ArrayList<Integer> list;
  // Place constructors here
  
  public Stack(){
    list = new ArrayList<Integer>();
  }

  public String toString(){ //allows stacks to be printed as a string
    return list.toString();
  }
  // Place methods here
  
  public boolean isEmpty(){//will return true if the list is empty
    return (list.size()==0); 
  }

  public void push(int value){ //adds value to the top of the list
    list.add(0,value);
    //adds to 0th
  }

  //Add new variable to save before removing
  public int pop(){  //make sure it's not empty
    if(list.isEmpty()){ 
      System.out.println("Error, cannot pop() from an empty list");
      return 9999;
    }else{
      int output = list.get(0);
      list.remove(0);
      return output; //fix
    }
    
  }

  public int top(){
    return list.get(0); //fix
  }

  public int size(){
    return list.size();
  }

  
}