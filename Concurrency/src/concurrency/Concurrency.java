/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package concurrency;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS202
 * Computer Programming 2
 * 09 Hands-on Activity 1
 */

import java.util.Scanner;

public class Concurrency extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Concurrency t1 = new Concurrency(); //thread #1
            Concurrency t2 = new Concurrency(); //thread #2
            
        //name of first thread via user-input
            System.out.print("Enter a name for your first thread: ");
            String t1_name = sc.nextLine();
            t1.setName(t1_name);
            
        //name of second thread via user-input   
            System.out.print("Enter a name for your second thread: ");
            String t2_name = sc.nextLine();
            t2.setName(t2_name);
        
        //displaying the name and state of the threads using getState()
            System.out.println("\n" + t1.getName() + " is " + t1.getState());
            System.out.println(t2.getName() + " is " + t2.getState());
         
            System.out.println("\nStarting the threads...");
            t1.start(); //starting thread 1
            t2.start(); //starting thread 2
        
        // try-catch method for thread sleeping
            try {
                t1.sleep(500); //t1 sleep for half a second
                t2.sleep(500); //t2 sleep for half a second
                
                System.out.println("\nAfter sleep...");
                
            //thread will show a terminated state if it sleeps
                System.out.println(t1.getName() + " is " + t1.getState()); 
                System.out.println(t2.getName() + " is " + t2.getState());
            } 
            
            catch (InterruptedException e) {
            //thread will display the state and name if it is interrupted while sleeping
                System.out.println("\nInterrupted...");
                System.out.println(t1.getName() + " is " + t1.getState());
                System.out.println(t2.getName() + " is " + t2.getState());

            }
    } 
    
    //displays the name and state of the current thread (for starting the thread)
    //name & state will not appear if there is no run method
    public void run() { 
        System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().getState());    
    }
}