/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskperftry;

import java.util.*;

// Run Employee
public class TaskPerfTry {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // name
      System.out.print("Enter Employee Name: ");
      String name = sc.nextLine();
      
      //Type of Employement
      System.out.print("Press F if you are a full time employee. Press P if you are a part time employee: ");
      String eType = sc.nextLine();
      
      // F is pressed
      if (eType.equalsIgnoreCase("F")) {
        FullTimeEmployee employ = new FullTimeEmployee(name);
        
        // Monthly Salary
        System.out.print("Hi, " + employ.getName() +"!"); 
        System.out.print(" Please enter your monthly salary: ");
        employ.setMonthlySalary(sc.nextDouble());
        
        System.out.println(employ);
      }
      
      // P is pressed
      else if (eType.equalsIgnoreCase("P")) {
        PartTimeEmployee employ = new PartTimeEmployee(name);
        
        // Hours Worked & Rate per Hour
        System.out.print("Hi, " + employ.getName() + "! ");
        System.out.print("Please enter your rate per hour and you total numbers of hours worked separated by a space: ");
        employ.setWage(sc.nextDouble(), sc.nextInt());
        
        System.out.println(employ);
      }
      
      // None / Invalid Input
      else {
          System.out.println("Invalid Input!");
      }
    }
}

//Employee
class Employee{
    private String name;
    
    public Employee(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

//Full Time Employee
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name) {
        super(name);
    }
    
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    public String toString(){
        return "\n Employee Name: " + getName() + "\n Monthly Salary: " + getMonthlySalary();
    }
}

//Part Time Employee
class PartTimeEmployee extends Employee {
    private  double ratePerHour;
    private int hoursWorked;
    private double wage;
    
    public PartTimeEmployee(String name){
        super(name);
    }
    
    public void setWage (double ratePerHour, int hoursWorked){
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = ratePerHour*hoursWorked;
    }
    
    public double getWage(){
        return wage;
    }
    
    public String toString(){
        return "\n Employee Name: " + getName() + "\n Wage: " + getWage();
    }
}