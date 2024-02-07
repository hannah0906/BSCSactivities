/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexer2;

/**
 * Ma. Hannah Mae Z. Paulino 
 * BSCS202 
 * Laboratory Exercise 2
 */
import java.util.*;

public class LabExer2 {
// Creating an object on the main class

    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

// Sets date to the method
    public void setItemName(String newItemName){
    this.itemName = newItemName;
    }
     
    public void setTotalCost(int quantity, double price){
    itemQuantity = quantity;
    itemPrice = price;
    }
    
// Gets the data

    public String getItemName() {
    return itemName;
    }
    
    public double getTotalCost() {
    return amountDue = itemQuantity*itemPrice;
    }


// reads user input 
    public void readInput () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing.");
        itemName = s.nextLine();
        System.out.println("Enter the quantity and price separated by a space.");
        itemQuantity = s.nextInt();
        itemPrice = s.nextDouble();
    }

// writes output
     public void writeOutput() {
        System.out.print("You are purchasing " + itemQuantity + " " + getItemName() + " (s) at ");
        System.out.printf("%.2f", itemPrice);
        System.out.println(" each.");
        System.out.printf("Amount due is %.2f", getTotalCost());
        System.out.println(" ");
    }

 // main method
    public static void main(String[] args){
    LabExer2 h = new LabExer2();
    h.readInput();
    h.writeOutput();    
    }
}