public class ExpressionTree{


    //You must write this method:
    //Calculate the value of the entire tree
    public double evaluate()
    {
      /*
        //  private double apply(double a, double b, char op){
        /*   private double value;
              private ExpressionTree left,right;
              private char operator;
      */
      
      //base case = 1 value/single tree
      if (isValue())
      {
        return value;
      }
      //if expression has 2 values 
      else //if (left.isValue() && right.isValue())
      {
        return apply(left.evaluate(), right.evaluate(), operator);
      }

      // example 
      // (8.0 * (2.0 + 10.0))
      // left : 8.0  right: 2.0 + 10.0
      // return apply(evaluate(8.0), evaluate(2.0 + 10.0), *);
      // evaluate(8.0) = 8.0
      // evaluate(2.0 + 10.0) = 12 = apply (2, 10, +); return 12;
      // return apply(8, 12, *);
      // return 8 * 12 = 96;
    }

    //You must write this method:
    //Return a string representation of the tree
    //A value should return just the value in string format
    //An operation has parenthesis around
    //such as
    //"12.5"  //just a value
    //"(5.0-8.0)" //a tree with 2 value children
    //"(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    //"(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more
      //"toString" and "evaluate" methods are missing from this file. We will need to add these. The "apply" method can be used inside the "evaluate" method.
    //toString method Collaborators: Christine M., Ed H.
    //Date: 7/27/22 
    public String toString()
    {
      if (isValue())//base case
      {
        return value + "";
      }
      return "(" + left + " " + operator + " " + right + ")";//left = left.toString() & right = right.toString() - Java does this automatically. This is how toString is called recursively.
    }


  private double value;
  private ExpressionTree left,right;
  private char operator;

  //Tree can be a value
  public ExpressionTree(double val)
  {
   value = val;
   left = null;
   right = null;
  }

  //Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r)
  {
    operator = op;
    left = l;
    right = r;
  }

  //Return true when the node is a value, false when it is an operator
  //when the children are null, the current tree is a value
  private boolean isValue()
  {
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator()
  {
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   
   if(op == '+')
   {
      return a+b;
   }
   else if(op == '-')
   {
      return a-b;
   }
   else if(op == '*')
   {
      return a*b;
   }
   else
   { //  if(op == '/'){ //or any invalid operators
      return a/b;
   }

  }

 }