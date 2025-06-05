/*
 *  CMSC 335 Project 2 "Cone.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: radius, and height.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

public class Cone extends ThreeDimensionalShape {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        super("cone.png");
        this.radius = addAttribute("Radius", radius);
        this.height = addAttribute("Height", height);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

}
