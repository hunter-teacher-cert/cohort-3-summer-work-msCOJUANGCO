import java.util.*;

public class Queue{

    // Place private instance variables here
    private ArrayList<Integer> list;
    
    // Place constructors here
    public Queue (){
        list = new ArrayList<Integer>();
    }

    public String toString(){ //allows queue to be printed as a string
        return list.toString();
    }

    public boolean isEmpty(){//will return true if the list is empty
        return (list.size()==0); 
    }
    // Place methods here


		//adds value to front
    public void enqueue (int value){
        list.add(0,value);
    }

    public int dequeue(){  //make sure it's not empty
        if(list.isEmpty()){ 
            System.out.println("Error, cannot dequeue() from an empty list");
            return 9999;
        }
        else{
            int output = list.get(list.size()-1);
            list.remove(list.size()-1);
            return output; //fix
        }
    }

    public int front(){  //same as deQ; no remove
        if(list.isEmpty()){ 
            System.out.println("Error, cannot front() from an empty list");
            return 9999;
        }
        else{
            int output = list.get(list.size()-1);
            return output; //fix
        }
    }
  
    public int size(){
        return list.size();
    }

}