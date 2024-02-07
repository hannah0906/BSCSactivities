/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolchatbot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SchoolChatbot {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc= new Scanner(System.in);

        //header
        System.out.println("----------------STI COLLEGE----------------");
        System.out.println("This is the official library chatbot of STI College Ortigas-Cainta.");       
        System.out.println("-------------------------------------------");
        Thread.sleep(2000);
        
        //greetings
        System.out.println("Good day! Welcome to STI College Ortigas-Cainta Library Chatbot.");
        Thread.sleep(1000);
        System.out.println("I am Hannah. I will be assisting you with your book-borrowing concern today.");
        Thread.sleep(1000);
        System.out.print("How do you want me to address you? ");
        String name = sc.nextLine();
        Thread.sleep(2000);
        
        //assessing mood
        System.out.print("Nice to meet you, " + name + "! How are you? ");
        String mood = sc.nextLine();
            if (mood.equalsIgnoreCase("good") || mood.equalsIgnoreCase("fine")) {
                System.out.println("That is good to hear, " + name + "!" );
            }
            else if (mood.equalsIgnoreCase("bad") || mood.equalsIgnoreCase("stressed")) {
                System.out.println("Uh oh! Don't worry, " + name + ". I am here to help you.");
            }
            else {
                System.out.println("I actually feel the same. Let's get through this together, " + name + "!");
            }
            
        Thread.sleep(2000);
        
        //student info & concern
        System.out.print("What is your surname? ");
        String sname = sc.nextLine();
        Thread.sleep(2000);
        
        System.out.print("Can I also know what program are you enrolled to? ");
        String prog = sc.nextLine();
        Thread.sleep(2000);
              
        System.out.println("Nice choice! I would also consider taking that."); 
        Thread.sleep(1000);
        System.out.print("What subjects do you want help with? ");
        String subj = sc.nextLine();
        Thread.sleep(2000);
        
        System.out.println("That seems really hard, but say less! I will do my best to assist you with your " + subj.toUpperCase() + " subject.");
        Thread.sleep(1000);
        
        System.out.print("What specific topic are you having a hard time with? ");
        String topic = sc.nextLine();
        Thread.sleep(2000);
        
        //answering the problems
        System.out.println("You are on the right hands, " + name + ".");
        Thread.sleep(1000);
        System.out.println("I will be the best help that you will have with " + topic.toUpperCase() + ".");
        Thread.sleep(2000);
        System.out.print("Do you want me to provide a HARDCOPY or a SOFTCOPY of the list of books available in the library that can help you? ");
        String list = sc.nextLine();
        
            if (list.equalsIgnoreCase("HARDCOPY")){
                System.out.println("Oh, you wanted to have a hardcopy. I will be printing it for you right now.");
                Thread.sleep(1000);
                System.out.println("Just head to the library on your convenient time to get your copy!");
            }
            
            else if (list.equalsIgnoreCase("SOFTCOPY")){
                System.out.println("Oh, you wanted to have a softcopy. I will be compiling it for you right now.");
                Thread.sleep(1000);
                System.out.println("Just wait for a few minutes and I will be emailing it to your school email, " + sname.toLowerCase() + "123@or-ca.sti.edu.ph");
            }
            
            else {
                System.out.println("We will be emailing you regarding that!");
            }
        
        //moving to close
        Thread.sleep(2000);
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("All done, " + name + ".");
        Thread.sleep(1000);
        System.out.println();

        System.out.print("Did I help you with your concern? ");
        String yn = sc.nextLine();
            if (yn.equalsIgnoreCase("yes")) {
                System.out.println("Whew! I am glad I did.");
            }
            
            else if (yn.equalsIgnoreCase("no")) {
                System.out.println("Oh no. Apologies for that, " + name + ".");
            }
            
            else {
                System.out.println("I hope I really helped you out, " + name + ".");
            }
            
        Thread.sleep(1000);
        System.out.print("While you were here, do you want me to provide you some study tips? ");
        String yeno = sc.nextLine();
            if (yeno.equalsIgnoreCase("yes")) {
                
                System.out.println("Cool! Here's a tip for you.");
                ArrayList tips = new ArrayList();
                Collections.addAll(tips, "Study in a quiet environment.", "Turn off your electronics when studying.", 
                        "Be sure that you are not hungry while studying.");
                Collections.shuffle(tips);
                System.out.println(tips.get(0));
                
            }
            
            else if (yeno.equalsIgnoreCase("no")) {
                System.out.println("Oh no. Apologies for that, " + name + ".");
            }
            
            else {
                System.out.println("Just head to the library if you need some!");
            }
            
        Thread.sleep(1000);
        System.out.println();
        
        //suggestion
        System.out.println("It was nice working with you, " + name + "!");
        Thread.sleep(1000);
        System.out.print("The library chatbot is always looking forward to improve! Do you have any feedback or suggestions? ");
        String input = sc.nextLine();
        Thread.sleep(2000);
        System.out.println("Your input is valuable! Thank you!");
        Thread.sleep(1000);
        
        //closing
        System.out.println();
        System.out.println("Have a very fantastic and productive day, " + name + ".");
        Thread.sleep(1000);
        
        System.out.println();
        System.out.println("If you have more concerns, feel free to contact us!");
        Thread.sleep(1000);
        
        //contact details
        System.out.println("-------------------------------------------");
        System.out.println("STI COLLEGE ORTIGAS-CAINTA LIBRARY");
        Thread.sleep(1000);
        System.out.println("Email: stiLibrary@or-ca.sti.edu.ph");
        Thread.sleep(1000);
        System.out.println("Contact Number: 099-456-7234");
        Thread.sleep(1000);
        System.out.println("Landline: 654-908-234");
        Thread.sleep(1000);
        System.out.println("Address: Ortigas-Cainta Extension, Cainta, Rizal, Philippines");
        Thread.sleep(1000);
        System.out.println("-------------------------------------------");
    }
    
}
