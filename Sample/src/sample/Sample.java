/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sample;

import java.util.*;

public class Sample {
// Creating an object on the main class
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;
    
// Sets Data to the Method 
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

    public void readInput () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing.");
        itemName = s.nextLine();
        System.out.println("Enter the quantity and price separated by a space.");
        itemQuantity = s.nextInt();
        itemPrice = s.nextDouble();
    }
    
    public void writeOutput() {
        System.out.print("You are purchasing " + itemQuantity + " " + getItemName() + " (s) at ");
        System.out.printf("%.2f", itemPrice);
        System.out.println(" each.");
        System.out.printf("Amount due is %.2f", getTotalCost());
        System.out.println(".");
    }

    public static void main(String[] args){
    Sample h = new Sample();
    h.readInput();
    h.writeOutput();    
    }
}