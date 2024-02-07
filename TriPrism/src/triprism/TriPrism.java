/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triprism;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS202
 * Computer Programming 2
 * 09 Hands-on Activity 1
 */

import java.util.Scanner;

public class TriPrism <T> {
    private T length;
    private T base;
    private T height;
    
    void setLength(T length) {
        this.length = length;
    }
    
    void setBase(T base) {
        this.base = base;
    }

    void setHeight(T height) {
        this.height = height;
    }
    
    T getLength() {
        return length;
    }
    
    T getBase() {
        return base;
    }
    
    T getHeight() {
        return height;
    }
}

class TriPrismDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            TriPrism<Integer> tp1 = new TriPrism<Integer>();
            TriPrism<Double> tp2 = new TriPrism<Double>();
         
        System.out.println("TriPrism #1");
        System.out.print("Lenght: ");
        tp1.setLength(sc.nextInt());
        
        System.out.print("Base: ");
        tp1.setBase(sc.nextInt());
        
        System.out.print("Height: ");
        tp1.setHeight(sc.nextInt());
        
        double volume = tp1.getLength() * (0.5 * tp1.getBase() * tp1.getHeight());
        System.out.println("Volume: " + volume);
        
        
        System.out.println("TriPrism #2");
        System.out.print("Lenght: ");
        tp2.setLength(sc.nextDouble());
        
        System.out.print("Base: ");
        tp2.setBase(sc.nextDouble());
        
        System.out.print("Height: ");
        tp2.setHeight(sc.nextDouble());
        
        double vol = tp2.getLength() * (0.5 * tp2.getBase() * tp2.getHeight());
        System.out.println("Volume: " + vol);
        
    }
}