/*
 *  CMSC 335 Project 2 "Cylinder.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: radius, and height.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

public class  Cylinder extends ThreeDimensionalShape {

    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        super("cylinder.png");
        this.height = addAttribute("Height", height);
        this.radius = addAttribute("Radius", radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

}
