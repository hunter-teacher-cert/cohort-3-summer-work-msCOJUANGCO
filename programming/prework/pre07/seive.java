import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;

/*************************
The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
********************************/
public class seive{

public static void main(String[] args) {

        int n;
    
    //choose #; generate # list**************
Scanner in =new Scanner(System.in);  
System.out.println("Choose a number.");
    n = in.nextInt(); 
System.out.printf("\nOk! Let's find the prime numbers from 0 to %d.\n", n);

System.out.println();
System.out.print("These are the prime numbers:\n"); 

seive (n);
        }
 
//followed steps on wikipedia explanation
public static void seive (int n) {
    int i=0;
    boolean [] primes;
    primes = new boolean [n];
    for (i=0; i<n; i++) {
        primes[i] = true;
        }
    
    for (int p=2; p*p < n; p++) {
        
        if (primes[p] == true) {
            
            for(i = p*p; i < n; i =i+p) {
                primes[i] = false;
                    }
            }
        }
    for(i = 2; i < n; i++) {
        if(primes[i] == true){
            System.out.println(i);         
                    }
                }
        }
} 