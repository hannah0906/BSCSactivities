/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fruitbasket;

import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object to read user input
        Stack basket = new Stack(); //stack to represent the fruit basket
        
        System.out.print("Enter the number of fruits you would like to catch: "); //asks user to enter number of fruits
        int num = sc.nextInt(); //stores user input on the variable named num
        
        System.out.println("Catch any of the following fruits: (1) Apple, (2) Orange, (3) Mango, (4) Guava");
        System.out.println("Press A for apple, O for orange, M for mango, and G for guava.");
        System.out.println("---------------------------------------------------------------------------------------");
        
        for (int i = 1; i <= num; i++) { //for loop to ask user to add fruits on the basket while true       
            
            System.out.print("Fruit " + i + " of " + num + ": "); 
            char choice = sc.next().charAt(0);

            switch (choice) {
                case 'a':
                case 'A':
                    basket.push("Apple"); //adds apple on the basket when a or A is chosen
                    break;
                
                case 'o':
                case 'O':
                    basket.push("Orange"); //adds orange on the basket when o or O is chosen
                    break;    
                    
                case 'm':
                case 'M':
                    basket.push("Mango"); //adds mango on the basket when m or M is chosen
                    break;
                
                case 'g':
                case 'G':
                    basket.push("Guava"); //adds guava on the basket when g or G is chosen
                    break;        
                    
                default: 
                    System.out.println("Only choose A, O, M, or G. Try Again."); //error message when other letters are chosen
                    i--; //decrements i for user to re-enter a choice of fruit
                    break;
            }
        }
        
        System.out.println("Your basket now has: " + basket); //displays the content of the basket
        System.out.println("---------------------------------------------------------------------------------------");
            
        while (!basket.isEmpty()){ //allows user to eat a fruit while the basket is not empty   
            System.out.print("Press E to eat a fruit: ");
            char eat = sc.next().charAt(0);
            
            if (eat == 'E' || eat == 'e') { //if user input is e, last element added is removed
                basket.pop();
                if (basket.isEmpty()) { //if basket is empty, display that here is no more fruit
                    System.out.println("No more fruits.");
                }
                
                else {
                    System.out.println("Fruit(s) in the basket " + basket);//if basket still has fruits, display remaining fruits
                    System.out.println("---------------------------------------------------------------------------------------");
                }
            }
        }
    }   
}[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]