/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author dzaka
 */
public class Rectangle extends Shape { // [TASK 2.1] Rectangle Subclass
    private double width;
    private double length;
    
    // Constructors
    // Constructor with default color, filled and radius
    public Rectangle(){
        super(); // call superclass no-arg constructor Shape()
        width = 1.0;
        length = 1.0;
    }
    
    // Constructor with default color and filled, but given width and length
    public Rectangle(double width, double length) {
        super(); // call superclass no-arg constructor Shape()
        this.width = width;
        this.length = length;
    }
    
    // Constructor with given color, filled and radius
    public Rectangle(double width, double length, String color, boolean bool) {
        super(color, bool); // call superclass no-arg constructor Shape()
        this.width = width;
        this.length = length;
    }
    
    // Getters and Setters
    /** getter and setter of the width **/
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    /** getter and setter of the width **/
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea() {
        return width * length; 
    }
    
    public double getPerimeter() {
        return 2 * (width * length); 
    }
    
    //Overrides
    @Override
    public String toString(){
        return "A Rectangle with width of " + width + " and length " + length + 
                ", which is a subclass of " + super.toString();
    }    
    
}
