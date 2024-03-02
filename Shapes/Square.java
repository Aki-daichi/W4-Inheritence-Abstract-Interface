/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author dzaka
 */
public class Square extends Rectangle {  // [TASK 2.1] Square subclass of Rectangle
    // Square has no instance variable, but 
    // inherits the instance variables width and length from its superclass Rectangle.
    
    // Constructors
    // Provide the appropriate constructors (as shown in the class diagram)
    public Square() {
        super(); // Call superclass Rectangle(double, double)
    }
    
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }
    
    
    public Square(double side, String color, boolean bool) {
        super(side, side, color, bool); // Call superclass Rectangle(double, double)
    }
    
    // Getters and Setters
    public double getSide() {
        return getWidth();
    }
    
    public void setSide(double side) {
        setWidth(side);
        setLength(side); 
    }
    
    //Overrides
    @Override
    public void setWidth(double side) {
        super.setWidth(side); // Call the setWidth method of the superclass (Rectangle)
    } 
    
    @Override
    public void setLength(double side) {
        super.setLength(side); // Call the setWidth method of the superclass (Rectangle)
    } 
    
    @Override
    public String toString() {
        return "A Square with a side of " + getSide() + ", which is a subclass of " + super.toString();
    }
}
