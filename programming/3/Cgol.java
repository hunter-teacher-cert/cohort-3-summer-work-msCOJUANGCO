import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: Saranii, Amanda, Ben, Nicole
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    //creates 2 d board
    char[][] board = new char[rows][cols];
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < cols; y++){
        board[x][y] = 'O';
      } 
    } // for int x
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    int rows = board.length;
    int cols = board[].length    //yes!! gj! but you have to fill in []
    
    for(int x = 0; x < rows)
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {

  }


  //Counts number of living neigbours of board[r][c] and returns it
  // public static int countNeighbours( char[][] board, int r, int c )
  // {

  // }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  // public static char getNextGenCell( char[][] board,int r, int c )
  // {

  // }


  // //generate and return a new board representing next generation
  // public static char[][] generateNextBoard( char[][] board )
  // {

  // }


  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    char[][] board; //declaration
    board = createNewBoard(25,25); //initializer

    // print board

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class