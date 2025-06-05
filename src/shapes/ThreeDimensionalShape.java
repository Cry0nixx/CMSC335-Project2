/*
 *  CMSC 335 Project 2 "ThreeDimensionalShape.java"
 *  Zachary Heisler
 *  6/4/2025
 *  The ThreeDimensionalShape class is an abstract class constructed as a shape with 3 dimensions.
 *  This class contains one required abstract method getVolume() whose purpose is to return a double
 *  that represents the volume of the shape that extends this class (e.g. Sphere or Torus)
 */
package shapes;

public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape() {
        super(3);
    }

    public abstract double getVolume();

}
