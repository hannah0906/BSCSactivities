/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietime;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class MovieTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object for user input
        Queue movies = new LinkedList(); //queue objects for snacks
        Queue snacks = new LinkedList(); //queue objects for snacks
    
     //movies
        for (int i=1; i <=3; i++) { //for loop to restrict number of user input to 3
        System.out.print("Enter movie " + i + " of 3: ");
        String movChoice = sc.nextLine();
        movies.offer(movChoice); //adds item to the movie queue
        }
        
    //snacks   
        for (int i=1; i <=3; i++) { //for loop to restrict user input to 3
        System.out.print("Enter snacks/beverage " + i + " of 3: ");
        String foodChoice = sc.nextLine();
        snacks.offer(foodChoice); //adds item to the snacks queue
        }
        
    System.out.println("-------------------------------------------------");
    System.out.println("Movies to watch are: " + movies);
    System.out.println("Snacks available are: " + snacks);
    System.out.println("-------------------------------------------------");

    while (!snacks.isEmpty()) { //executes when snacks queue is not empty
        
            System.out.print("Press S each time you finish a snack: ");
            char choice = sc.next().charAt(0);

            if (choice == 'S' || choice == 's') { 
                snacks.poll(); //removes the head of the queue if s is entered
                if (snacks.isEmpty()) { //displays an error message if snacks queue is empty
                    System.out.println("No more snacks."); 
                }
                
                else { //displays available snacks if snacks queue is not empty
                    System.out.println("Snack(s) available: " + snacks);
                    System.out.println("-------------------------------------------------");

                }
            }
            
            else {
                System.out.println("Invalid input.");
            }
    }

    } 
}