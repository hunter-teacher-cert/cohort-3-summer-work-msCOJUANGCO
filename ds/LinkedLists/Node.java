//NOTE TO SELF: lost(misplaced?) other node.java file while updating; review this, taken from group work, after class
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