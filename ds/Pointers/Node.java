//COLLABORATORS: Greg S., Stacey G., Wayne T., Nicole C.

import java.io.*;
import java.util.*;

//getNext = return type is node 
//setNext = 

public class Driver{

    public static void main(String[] args) {

	// Fist:
	// Start here and trace through
	// the code by hand until the comment
	// that says stop tracing

	Node front;//created new Node data type called front
	front = new Node("one");//new node called front, the value is set to a string of "one" 
	front.setNext(new Node("two"));//front is pointing to a NEW node with the string value of "two" 
	front.getNext().setNext(new Node("three")); //front sets the value to three
	front.getNext().getNext().setNext(new Node("four"));

	System.out.println(front.getData());

	Node walker;

	walker = front;
	System.out.println(front.getData());
	walker = walker.getNext();
	System.out.println(walker.getData());
	System.out.println(front.getNext().getData());

	// stop tracing

	// Now, compile and run the program
	// using "javac Driver.java Node.java"
	// and then "java Driver"

	// Once you've run,
	// complete the program as per the following comments
	// and compile and run your program again.

	// Add a line to set the walker variable defined above
	// so that it points to (refers to) the same node as
	// the variable front points to.
	
	// Uncomment the next line, compile and run
	// to test what you just added
	//System.out.println(walker.getData());

	// Add the code necessary
	// to set up a loop that
	// 1. prints out what is in walker.data()
	// 2. moves walker to point to the next node
	// 3. loops until walker gets to null

      while(walker !=null) {
        System.out.print(walker);
        walker = walker.getNext();
      }
	
    }

}

public class Node{
  private String data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(String data){
    this.data = data;
    this.next = null;

  }


  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }

  // Getters
  
  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  // Setters
  
  public void setData(String data){
    this.data = data;
  }
    
    public void setNext(Node next){
	this.next = next;
  }

  
  // toString
  
  public String toString(){
    return "" + data + "->";
  }
}