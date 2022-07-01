import java.io.*;
import java.util.*;
import java.util.Scanner;

/***********************************
Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program. As you develop your code, test it with a small number of verses.
***********************************/
public class beer{

//can input however many verses is preferred
public static void main (String[]args){

Scanner in = new Scanner(System.in);
sing (99);
}

//prints lyrics 
public static void sing(int n) {
    int oldNum = n;
    int newNum = n-1;
    
    if (n > 1) {     
        System.out.printf( "%d bottles of beer on the wall\n%d bottles of beer, \nya' take one down, ya'pass it around\n%d bottles of beer on the wall", oldNum,oldNum,newNum);
        System.out.println();        
        System.out.println();
        sing (n-1);

    } else {
        System.out.println("1 bottle of beer on the wall, \n1 bottle of beer, \nya'take one down \nya' pass it around, \nthen there's 0 bottles of beer on the wall!");
        System.out.println();

System.out.println("No bottles of beer on the wall, \nno bottles of beer, \nya'can't take one down \nya' can't pass it around, \n'cause there bottles of beer on the wall!");;
    }   
}}            
        