import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

  Stack s = new Stack();
  System.out.println(s.isEmpty()); 
  s.push(3);
  s.push(5);
  s.push(7);
  System.out.println(s);  
  
  System.out.println(s.isEmpty()); 
  System.out.println(s.top()); 
  System.out.println(s.pop()); 
  System.out.println(s);  
    System.out.println(s.pop()); 
    System.out.println(s.pop()); 
    System.out.println(s.pop()); 

   Queue q = new Queue();
  System.out.println(q.isEmpty()); 
  q.enqueue(3);
  q.enqueue(5);
  q.enqueue(7);
  System.out.println(q);  
  
  System.out.println(q.isEmpty()); 
  System.out.println(q.front()); 
  System.out.println(q.dequeue()); 
  System.out.println(q);  
    System.out.println(q.dequeue()); 
    System.out.println(q.dequeue()); 
    System.out.println(q.dequeue()); 
    
  }
  
}t