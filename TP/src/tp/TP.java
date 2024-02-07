/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp;

import java.util.*;
//Run Employee
public class TP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("F - Full Time P - Part Time: ");
        String eType = sc.nextLine();
        
        // F
        if (eType.equalsIgnoreCase("F")){
            FullTimeEmployee employ = new FullTimeEmployee(name);
            
            System.out.print("What is your monthly Salary? ");
            employ.setMonthlySalary(sc.nextDouble());
            
            System.out.println(employ);
        }
        
        // P
        else if (eType.equalsIgnoreCase("P")){
            PartTimeEmployee employ = new PartTimeEmployee(name);
            
            System.out.print("Rate per hour and Hours worked separated by a space: ");
            employ.setWage(sc.nextDouble(), sc.nextInt());
            
            System.out.println(employ);
        }
        
        else {
            System.out.println("Invalid!");
        }
    }
    
}

// Employee
class Employee {
    private String name;
    public Employee (String name) {
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

// Full Time Employee
class FullTimeEmployee extends Employee{
    private double monthlySalary ;
    
    public FullTimeEmployee(String name){
        super (name);
    }
    
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary (){
        return monthlySalary;
    }
    
    public String toString(){
        return "\n Name: " + getName() + "\n Monthly Salary: " + getMonthlySalary();
    }
    
}
    // Part Time Employee
class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hoursWorked;
    private double wage;
    
    public PartTimeEmployee (String name){
        super (name);
    }
    
    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = ratePerHour*hoursWorked;
    }
    
    public double getWage(){
        return wage;
    }

     public String toString(){
        return "\n Name: " + getName() + "\n Wage: " + getWage();
    }

}
