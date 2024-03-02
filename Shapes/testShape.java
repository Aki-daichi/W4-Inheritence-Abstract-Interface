/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author dzaka
 */
public class testShape {    // [TASK 2.1] test program to test all the methods defined in Shape.
   public static void main (String[] args) {
    // Declare and allocate a new instance of Shape
    // with default values
    Shape def = new Shape();
        System.out.println("Default: " + def.toString() + "\n");
  
   
    // with given values
    Shape giv = new Shape("red", false);
        System.out.println("Given: " + giv.toString() + "\n");
   
   
    // Declare and allocate a new instance of Circle
    // with given values
    Circle cir1 = new Circle();
        System.out.println("Circle test: " + cir1.toString() + "\n");
   
   
    // Declare and allocate a new instance of Rectangle
    // with given values
    Rectangle rec1 = new Rectangle();
        System.out.println("Rectangle test: " + rec1.toString() + "\n");
        
    // Declare and allocate a new instance of Square
    // with given values
    Square squ1 = new Square();
        System.out.println("Square test: " + squ1.toString() + "\n");
   }
   
}
    
