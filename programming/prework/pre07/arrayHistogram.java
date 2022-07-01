import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

public class arrayHistogram {

    
public static void main(String[] args) {

    //PRINTS RANDOMIZED NUMBER LIST*****************
        
        int scores = 3; // # of values; can change
        int[] counts = new int[100];// # of counts; can change
        int[] count;
        int[] array = randomArray(scores); //create

System.out.printf("Our array has  %s values.", scores); 
System.out.println("\nThis is our array:");
printArray(array); //print

    for (int score : array) {
        counts[score]++;
    printArray(counts);
System.out.println (inRange(count));

//inRange(array);
//System.out.println (count[i]);
//printArray(count);


        }
    }  

//TRAVERSE + COUNT ARRAY*************************
public static int inRange(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= 10 && a[i] < 70) {
            count++;
        }
    }
    count =count;
    return count;

}



  //CREATES RANDOM ARRAY*************************
public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
        }
      
    return a;
      }
  
//PRINTS ARRAYS*************************
public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.println(", " + a[i]);
    }
    System.out.println("}");
}



    
}




