/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package favmovie;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS302
 * Data Structures and Algorithm
 */

import java.util.LinkedList; //imports the linked list class
public class FavMovie {
    public static void main(String[] args) {
        
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
