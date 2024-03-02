/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author dzaka
 */
public class Shape {
    // Private instance variable
    private String color;
    private boolean filled;
    
    // Constructors
    /** [TASK 2.1] a no-arg (no-argument) constructor **/
    public Shape() {
        color = "green"; // that initializes the color to "green"
        filled = true;  // and filled to true
    }
    
    /** [TASK 2.1] a constructor that initializes the color and filled to the given values. **/
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // Getter and Setters
    /** [TASK 2.1] Getter and setter for all the instance variables. **/
    public String getColor() {
        return this.color;
    }
    
    public boolean isFilled() {
        return this.filled;
    }
    
    public String toString() { // [TASK 2.1] a toString Method
        return "A Shape with color of " + color + " and " + filled;
    }
}
