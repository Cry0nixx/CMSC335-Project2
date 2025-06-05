/*
 *  CMSC 335 Project 2 "Sphere.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by one input: radius.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        super("sphere.png");
        this.radius = addAttribute("Radius", radius);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

}
