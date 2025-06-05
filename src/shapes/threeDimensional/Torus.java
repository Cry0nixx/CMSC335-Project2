/*
 *  CMSC 335 Project 2 "Torus.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: innerRadius and outerRadius
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

public class Torus extends ThreeDimensionalShape {

    private final double innerRadius;
    private final double outerRadius;

    public Torus(double innerRadius, double outerRadius) {
        super("torus.png");
        this.innerRadius = addAttribute("Inner Radius", innerRadius);
        this.outerRadius = addAttribute("Outer Radius", outerRadius);
    }

    @Override
    public double getVolume() {
        return 2.0 * Math.PI * Math.PI * outerRadius * innerRadius * innerRadius;
    }

}
