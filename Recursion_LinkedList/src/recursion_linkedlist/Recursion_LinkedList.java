/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion_linkedlist;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS302
 * Data Structures and Algorithm
 */

import java.util.Scanner; //imports the scanner class for user input
import java.util.LinkedList; //imports the linked list class
public class Recursion_LinkedList {

    ///Recursive function to calculate the fibonacci sequence
    public static int fib(int num){
        if (num <= 1) { //base case
            return num;
        }
        
        else {
            return fib(num - 1) + fib(num - 2); //calculates the fibonacci sequence
        }
    }
    
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object for user input
        System.out.print("Enter a number higher than 0: "); //user input for the number to be computed
        int num = sc.nextInt(); //stores the user input to variable named num
        
        //loop to calculate the number up to the range (num) to create a sequence
        for (int i = 0; i < num; i++){
            System.out.println(fib(i)); //prints the fibonacci sequence
            System.out.println();
        }
        
        LinkedList<String> movie = new LinkedList<>(); //declares a linked list named movie
        
            //adds moviie titles to the 'movie' linked list
            movie.add("Mean Girls");
            movie.add("Pitch Perfect");
            movie.add("Legally Blonde");
            movie.add("Flipped");
        
    //different types of printing a linked list
        System.out.println("Favorite movies: " + movie); //prints the 'movie' linked list as is
        System.out.println("----------------------------------------------------------------------"); //divider
        
        //for loop for converting the 'movie' linked list to a string
        for (String movies : movie){ 
            System.out.println(movies); //prints the string version of the 'movie' linked list
        }
    }
    
}