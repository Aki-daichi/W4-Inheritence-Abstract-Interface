/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author dzaka
 */
public class Circle extends Shape { // [TASK 2.1] Subclass Cirlce
    private double radius; // private variable

    // Constructors
    // Constructor with default color, filled and radius
    public Circle(){
        super(); // call superclass no-arg constructor Shape()
        radius = 1.0;
    }
    
    // Constructor with default color, filled but given radius
    public Circle(double radius){
        super(); // call superclass no-arg constructor Shape()
        this.radius = radius;
    }
    
    // Constructor with given color, filled and radius
    public Circle(double radius, String color, boolean bool){
        super(color, bool); // call superclass Shape(color, bool)
        this.radius = radius;
    }
    
    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Overrides
    @Override
    public String toString(){
        return "A Circle with a radius of " + radius + ", which is a subclass of " + super.toString();
    }    
    
}
