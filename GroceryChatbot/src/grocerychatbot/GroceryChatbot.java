/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grocerychatbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class GroceryChatbot {
        public static String food, food1, toilet, toilet1, can, can1;
        public static Scanner sc = new Scanner(System.in);
        private static Map<String, Double> itemPrices = new HashMap<>();
        
    public static void main(String[] args) throws InterruptedException{
        
//header
        System.out.println("--------------------------------------------------------------------");
        System.out.println("  Welcome to Got to Bili: Your one-stop-shop for your daily needs!  ");
        System.out.println("--------------------------------------------------------------------");
        Thread.sleep(2000);
//greetings
        System.out.println("Good day! I am Hannah, I will be assisting you with your purchase today.");
        Thread.sleep(1000);
        System.out.print("How do you want me to address you? ");
        String name = sc.nextLine();

    
//displaying menu
        System.out.print("Hi, " + name + ". What kind of item do you want to buy? We offer foods, toiletries, and supplies. ");
        String buy = sc.nextLine();
        
        String buy1 = buy.toLowerCase();
        
            if (buy1.contains("food")) { 
                chooseFood(); //method to exceute if customer chose to buy food
            }
        
            else if (buy1.contains("toiletries")) { 
                chooseToiletries(); //method to exceute if customer chose to buy toiletries
            }
            
            else if (buy1.contains("supplies")) {
                chooseSupplies(); //method to exceute if customer chose to buy supplies
            }
            
            else {
                System.out.println("Uh oh, Looks like we do not have what you are looking for. Thank you for visiting though!");    
            }
            
    Thread.sleep(2000);
    System.out.println();

    //thank you message
    System.out.println("Thank you for purchasing, " + name + "!");
    Thread.sleep(1000);
    System.out.print("Would you like it to be delivered? ");
    String yn = sc.nextLine();
    
        if (yn.equalsIgnoreCase("yes")) { //if the cutomer chose it to be delivered
            System.out.println("We will be delivering it to you right away!");
            System.out.println();
            System.out.println("Before we proceed with confirming your purchase, please fill out the form below.");
            System.out.print("Full Name: ");
            String Fname = sc.nextLine();
            System.out.print("Contact No.: ");
            String contact = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
        }
        
        else if (yn.equalsIgnoreCase("no")) { //if the cusomer did not want it to be delivered
            System.out.println("Alright! Fetch your grocery whenever you're free. Just present your receipt.");
            System.out.println();
            System.out.println("Before we proceed with confirming your purchase, please fill out the form below.");
            System.out.print("Full Name: ");
            String Fname = sc.nextLine();
            System.out.print("Contact No.: ");
            String contact = sc.nextLine();
            System.out.print("Date of pick-up: ");
            String address = sc.nextLine();
        }
    
    System.out.println();
    System.out.println("Confirming your order...");
    System.out.println();
    System.out.println("Order Confirmed!");
    System.out.println();

    Thread.sleep(1000);

//dipsplay random shopping tips if the customer wants some   
    System.out.print("While you were here, do you want me to provide you some shopping tips? ");
        String yeno = sc.nextLine();
            if (yeno.equalsIgnoreCase("yes")) { //customer wants shopping tips
                
                System.out.println("Cool! Here's a tip for you.");
                ArrayList tips = new ArrayList();
                Collections.addAll(tips, "Tip: Only buy what you need.", "Tip: Have a list of things that you wanted to buy.", 
                        "Tip: Shop at Got to Bili!");
                Collections.shuffle(tips);
                System.out.println(tips.get(0));
                
            }
            
            else if (yeno.equalsIgnoreCase("no")) { //customer did not want shopping tips
                System.out.println("Just head to Got To Bili if you need some!");
            }
            
        Thread.sleep(1000);
        System.out.println();
 
//suggestion
        Thread.sleep(1000);
                ArrayList mood = new ArrayList();
                Collections.addAll(mood, "nice", "great","wonderful");
                Collections.shuffle(mood);
        System.out.println("It was " + mood.get(0) + " working with you, " + name + "!");
        System.out.print("Got To Bili is always looking forward to improve! Do you have any feedback or suggestions? ");
        String input = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Your input is valuable! Thank you!");
        Thread.sleep(1000);
        
 //closing
        System.out.println();
        System.out.println("Have a very fantastic and fruitful day, " + name + ".");
        Thread.sleep(1000);

//contact details        
        System.out.println();
        System.out.println("If you have more concerns, feel free to contact us!");
        Thread.sleep(1000);
        
        //contact details
        System.out.println("-------------------------------------------");
        System.out.println("                GOT TO BILI               ");
        Thread.sleep(1000);
        System.out.println("Email: GotToBiliInMagic@gmail.com");
        Thread.sleep(1000);
        System.out.println("Contact Number: 099-456-7234");
        Thread.sleep(1000);
        System.out.println("Instagran: @GotToBiliInMagic");
        Thread.sleep(1000);
        System.out.println("Address: Ortigas-Cainta Extension, Cainta, Rizal, Philippines");
        Thread.sleep(1000);
        System.out.println("-------------------------------------------");
}

    
    private static void chooseFood(){ //displays food choices
        System.out.print("What kind of food are you looking for? We offer meat, snacks, and canned goods. ");
        food = sc.nextLine();
        
        food1 = food.toLowerCase();
            if (food1.contains("meat")){
                System.out.println();
                System.out.println("You chose meat! Please stay still as we provide the list of meats available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                meat(); //displays meat choices
                selectItems(); //executes if item is selected
            }  
            
            else if (food1.contains("snacks")){
                System.out.println();
                System.out.println("You chose snacks! Please stay still as we provide the list of snacks available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                snacks(); //displays snacks choices
                selectItems();
           }
                
            else if (food1.contains("canned goods")){
                System.out.println();
                System.out.println("You chose canned goods! Please stay still as we provide the list of canned goods available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                canned(); //displays canned food choices
                selectItems(); //executes if item is selected
            }
            
            else{
                System.out.println();
                System.out.println("Oops! Looks like we do not have what you are looking for. Thank you for visiting though!");
            }
    }
    
     private static void chooseToiletries(){ //displays toiletries choices
        System.out.print("What kind of toiletries are you looking for? We offer soap, toothbrushes, and tissues. ");
        toilet = sc.nextLine();
        
        toilet1 = toilet.toLowerCase();
            if (toilet1.contains("soap")){ 
                System.out.println();
                System.out.println("You chose soap! Please stay still as we provide the list of soaps available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                soap(); //displays soap choices
                selectItems(); //executes if item is selected

            }  
            else if (toilet1.contains("toothbrush")){
                System.out.println();
                System.out.println("You chose toothbrush! Please stay still as we provide the list of toothbrushes available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                toothbrush(); //displays toothbrush choices
                selectItems(); //executes if item is selected
           }
                
            else if (toilet1.contains("tissue")){
                System.out.println();
                System.out.println("You chose tissue! Please stay still as we provide the list of tissue available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                tissue(); //displays tissue choices
                selectItems(); //executes if item is selected
            }
            
            else{
                System.out.println();
                System.out.println("Oops! Looks like we do not have what you are looking for. Thank you for visiting though!");
            }
    }
     
        private static void chooseSupplies(){ //displays supplies choices
        System.out.print("What kind of supplies are you looking for? We offer school and office supplies. ");
        can = sc.nextLine();
        
        can1 = can.toLowerCase();
            if (can1.contains("school")){
                System.out.println();
                System.out.println("You chose school supplies! Please stay still as we provide the list of school supplies available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                school(); //displays school supplies choices
                selectItems(); //executes if item is selected
            }  
            
            else if (can1.contains("office")){
                System.out.println();
                System.out.println("You chose office supplies! Please stay still as we provide the list of office supplies available.");
                System.out.println();
                System.out.println("Processing...");
                System.out.println();
                office(); //displays office supplies choices
                selectItems(); //executes if item is selected
           }
                
            else{
                System.out.println();
                System.out.println("Oops! Looks like we do not have what you are looking for. Thank you for visiting though!");
            }
    }
        
    private static void meat(){ //meat options
        System.out.println("------------ MEAT PRODUCTS ------------");
        itemPrices.put("Pork", 212.99);
        itemPrices.put("Beef", 317.20);
        itemPrices.put("Chicken", 160.50);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("---------------------------------------");
    }
    
    private static void snacks(){ //snacks options
        System.out.println("--------------- SNACKS ---------------");
        itemPrices.put("Chips", 32.25);
        itemPrices.put("Biscuits", 21.33);
        itemPrices.put("Chocolates", 75.50);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("---------------------------------------");
    }
    
    private static void canned(){ //canned goods options
        System.out.println("------------- CANNED GOODS -------------");
        itemPrices.put("Corned Beef", 65.50);
        itemPrices.put("Meat Loaf", 23.20);
        itemPrices.put("Sausage", 62.50);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("---------------------------------------");
    }
    
    private static void toothbrush(){ //toothbrush options
        System.out.println("------------- TOOTHBRUSH -------------");
        itemPrices.put("Soft Bristles", 82.50);
        itemPrices.put("Hard Bristles", 85.50);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("--------------------------------------");
    }
    
    private static void tissue(){ //tissue options
        System.out.println("--------------- TISSUE ---------------");
        itemPrices.put("Paper Towel", 100.25);
        itemPrices.put("Regular Tissue", 85.50);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("--------------------------------------");
    }
    
     private static void soap(){ //soap options
        System.out.println("---------------- SOAP ----------------");
        itemPrices.put("Laundry Detergent", 272.30);
        itemPrices.put("Bath Soap", 30.45);
        itemPrices.put("Shower Gel", 145.90);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        System.out.println("---------------------------------------");
    }
     
    private static void school(){ //school supplies options
        System.out.println("---------------- SCHOOL SUPPLIES ----------------");
        itemPrices.put("Paper", 60.75);
        itemPrices.put("Ballpen", 10.45);
        itemPrices.put("Pencil", 9.90);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("-------------------------------------------------");
    }
     
    private static void office(){ //office supplies options
        System.out.println("---------------- OFFICE SUPPLIES ----------------");
        itemPrices.put("Bond Paper", 189.75);
        itemPrices.put("Folder", 15.45);
        itemPrices.put("Envelop", 11.90);
        
        for (Map.Entry<String, Double> entry : itemPrices.entrySet()) {
        String itemName = entry.getKey();
        Double itemPrice = entry.getValue();
        System.out.printf("%-20s ₱%.2f%n", itemName, itemPrice);
        }
        
        System.out.println("-------------------------------------------------");
    }
    
    private static void selectItems() {
    List<String> selectedItems = new ArrayList<>();

//select items
        System.out.println("Enter the item you want to add to your cart (Type 'done' when finished): ");
        while (true) {
            
            String selectedItem = sc.nextLine();

            if (selectedItem.equalsIgnoreCase("done")) {
                break;
            }

            if (itemPrices.containsKey(selectedItem)) {
                selectedItems.add(selectedItem);
            } 
            
            else {
                System.out.println("Invalid item. Please choose from the list. Hint: Capitalize the first letter.");
            }
        }

//display selected items and calculate total
        double total = 0.0;        
            for (String item : selectedItems) {
            double price = itemPrices.get(item);
            total += price;
        }
            System.out.println();
            System.out.println("Printing your receipt...");
            System.out.println();
            printReceipt(selectedItems, total);
    }

//prints the receipt
    private static void printReceipt(List<String> selectedItems, double total) {
    System.out.println("---------------------------- RECEIPT ----------------------------");
    System.out.println("Item\t\t\tPrice");
    System.out.println("--------------------------------------------------------------------");

        for (String item : selectedItems) {
        double price = itemPrices.get(item);
        System.out.printf("%-20s ₱%.2f%n", item, price);
        }

    System.out.println("--------------------------------------------------------------------");
    System.out.printf("Total\t\t\t₱%.2f%n", total);
    System.out.println("--------------------------------------------------------------------");
}
}


