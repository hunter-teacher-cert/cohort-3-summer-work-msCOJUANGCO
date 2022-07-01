import java.util.Random;
import java.util.Scanner;


/**
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31

*/

public class Guess {
    
public  static void main (String[]args) {

Scanner in = new Scanner(System.in);

        int guess;
        int number;
        int diff;
// pick a random number starter code
    Random random = new Random();
    number = random.nextInt(100) + 1;
    //System.out.println(number);  

         
// A. prompt the user for input
System.out.println("I'm thinking of a number between 1 and 100 (including both).Can you guess what it is?");

 
// B. read an int value from the keyboard
guess = in.nextInt();

// C. calculate the difference
diff = (int) (number - guess);

//D. verify input & state output
//System.out.println("Your guess is: " + guess);  
//System.out.println("The number I was thinking of was: " + number);  
//System.out.println("The number I was thinking of was: " + number); 
//alternative code!
System.out.printf("Your guess is: %d\nThe number I was thinking of was: %d\nYou were off by:%d\n", guess,number,diff);
/**
// D. format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".
System.out.printf(cel + " C = %.1f F", far);
*/
    }
}

