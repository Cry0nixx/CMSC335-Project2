/*
 *  CMSC 335 Project 2 "TwoDimensionalShape.java"
 *  Zachary Heisler
 *  6/4/2025
 *  The TwoDimensionalShape class is an abstract class constructed as a shape with 2 dimensions.
 *  This class contains one required abstract method getArea() whose purpose is to return a double
 *  that represents the area of the shape that extends this class (e.g. Circle or Square)
 */
package shapes;

public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape() {
        super(2);
    }

    public abstract double getArea();
}
