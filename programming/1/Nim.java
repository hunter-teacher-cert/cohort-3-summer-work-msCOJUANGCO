import java.io.*;
import java.util.*;

public class Nim 
{

  public static void main( String[] args ) 
{

    int stones = 12;
    int stonesTaken;

        while(stones > 3){
            stones = userTurn(stones);

        }
}
        /*
            if(stones > 0){
                stones = aiTurn(stones);
            if(stones < 1){
          System.out.println("The AI won :(");
        }

                */
/* 
announce winner

*/

//A. facilitate play until human or AI wins, and 
    //loop until game ends
//A. user turn 

                
//B.prompt for user input : num of stones
//C.calculate number of stones remaining & print
    //!!!!! input not in, check line 13
public static int userTurn(int stones){        

Scanner input = new Scanner(System.in);
System.out.println("How many stones would you like to remove?");
    int guess;
    guess = input.nextInt();
    stones = (int)(stones - guess);

System.out.printf("There are %d stones left", stones);

}

    

/*
    
    
      //check for win
        if(stones <= 3){
          System.out.println("You lose, loser");
        }
        else{
        System.out.println("You won!");  
            
        if(stones > 3){
          AIturn(stones);
        }
        else{
        System.out.println("You won!"); 

        }
        
      
      //machine turn
      //method for AIturn (thanks David!)

/*
public static int aiTurn(int stones){
    Random rand = new Random();
    
    int stonesTaken;
    
    if(stones > 3){
        stonesTaken = rand.nextInt(3) + 1;
        System.out.printf("The AI removed %d stones.\nThere are %d stones remaining.\n", stones,stonesTaken);
      }            
//!!!!! review why +1 in line 48
   
     //check for win
        if(stones > 3){
          AIturn(stones);
        }
        else{
        System.out.println("You won!");  

      //calculate number of stones remaining, print

    }

//method for AIturn (thanks David!)
public static int aiTurn(int stones){
    Random rand = new Random();
    
    int stonesTaken;
    
    if(stones < 3){
      stonesTaken = rand.nextInt(stones) + 1;
      } else{
        stonesTaken = rand.nextInt(3) + 1;
      }

      }

  }

}
/**

 * Game of Nim by...
 * David Moste
 * collaborators: Nicole Cojuangco, Christine Marra, Parmanand Mohanlall


import java.io.*;
import java.util.*;

public class Nim{
  public static void main(String[] args){
    int stones = 12;
    
    while(stones > 0){
      stones = userTurn(stones);
      if(stones > 0){
        stones = aiTurn(stones);
        if(stones < 1){
          System.out.println("The AI won :(");
        }
      } else{
        System.out.println("You won!");
      }
    }
  }

  
    Scanner input = new Scanner(System.in);
    
    int stonesTaken;
    
    System.out.printf("There are %d stones left in the bag.\n", stones);
    System.out.print("How many stones do you want to pick? ");
    stonesTaken = input.nextInt();
      
    stones -= stonesTaken;
    System.out.printf("There are %d stones remaining.\n", stones);

    return stones;
  }

  public static int aiTurn(int stones){
    Random rand = new Random();
    
    int stonesTaken;
    
    if(stones < 3){
      stonesTaken = rand.nextInt(stones) + 1;
      } else{
        stonesTaken = rand.nextInt(3) + 1;
      }

    System.out.printf("The AI removed %d stones.\n", stonesTaken);
    stones -= stonesTaken;
    System.out.printf("There are %d stones remaining.\n", stones);

    return stones;
  }
}
**/