/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskperf6;

/**
 * Paulino, Ma. Hannah Mae Z.
 * Task Performance
 * BSCS202
 * Computer Programming 2
 */

import java.util.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;


public class TaskPerf6 {
    
     static Scanner sc = new Scanner(System.in); //allows the usage of scanner anywhere in the class
     static int retry = 0; // allows the usage of retry method anywhere in the class
     
    public static void main(String[] args) {
       
        
        while (retry == 0) { // will execute until retry == 1 (end of execution)
            
        try { 
        System.out.println("---Welcome user!---");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Please choose an action: ");
        int option = sc.nextInt(); //user input for login or register
        sc.nextLine(); 
        
        switch (option) {
            case 1:
            registerPage(); // method for registration
            break;
            
            case 2:
            loginPage(); // method for login 
            break;
            
            default: // will execute if user input is not equals to 1 or 2
            System.out.println("Only choose between 1 or 2. Please try again."); 
            break;
        }
        }
 
        catch (InputMismatchException ex){ //executes if input is not int
        System.out.println("Only choose between 1 or 2. Please try again."); 
        sc.next(); 
        }   
        }
    }


public static void registerPage(){
System.out.println("---REGISTER PAGE---");
try {
    Path filePath = Paths.get("records.txt"); //relative path
    //creates new file if file does not exist & opens file if it already exist
    // adds text at the end (append)
    OutputStream outStream = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE, APPEND)); 
    BufferedWriter bW = new BufferedWriter(new OutputStreamWriter(outStream)); //writes texts to output stream
    
    //username
    System.out.print("Enter a username: ");
    String un = null; 
    un = sc.nextLine();
    
    while (!un.matches("^[a-zA-Z0-9]+$")) {
        System.out.println("Username should only contain alphanumeric characters. Try again.");
        System.out.print("Enter a username: ");
        un = sc.nextLine();    
    }
    
    //password
    System.out.print("Enter a password: ");
    String pw = null;
    pw = sc.nextLine();
  
    while (!pw.matches("^[a-zA-Z0-9]+$")) {
        System.out.println("Username should only contain alphanumeric characters. Try again.");
        System.out.print("Enter a password: ");
        pw = sc.nextLine();
    }

bW.write(un + ":" + pw); //format for transferring input to text file
bW.newLine(); //separates line
System.out.println("Registration Successful!");
bW.close(); //prevents memory leak
outStream.close(); //prevents memory leak
}

catch (IOException ex){
    System.out.println(ex.getMessage());
}
}

public static void loginPage(){
System.out.println("---LOGIN PAGE---");
try {
    Path filePath = Paths.get("records.txt"); //relative path
    // opens file for reading contents of filePath
    InputStream inStream = Files.newInputStream(filePath);
    BufferedReader bR = new BufferedReader(new InputStreamReader(inStream));
    
    String placeHolder; //holds bR.readLine
    int found = 0; // unsuccessful login
    
    System.out.print("Enter your username: ");
    String username = sc.nextLine(); //username to be read from the txt file
    
    System.out.print("Enter your password: ");
    String password = sc.nextLine(); //password to be read from the txt file
    
    while ((placeHolder = bR.readLine())!= null){ //reads lines from the text file
        String[] parts = placeHolder.split(":"); //splits txt file line from :
   
        if (username.equals(parts[0]) && password.equals(parts[1])) { //part[0] is username, part[1] is password
        found = 1; //successful login
        }
    }
    
        if(found == 1){
            System.out.println("Successfully logged in.");
            retry = 1; // end of code
        }
        
        else{
            System.out.println("Incorrect username of password.");
            loginPage(); //restarts login page
        }
    
    bR.close(); //prevents memory leak
    inStream.close(); //prevents memory leak
    
}
    
    catch(NoSuchFileException ex){
        System.out.println("No File Found.");
    }

    catch (IOException ex){
        System.out.println("Try again.");
    }
} 
}

