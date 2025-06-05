/*
 *  CMSC 335 Project 2 "Cube.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by one input: side.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

public class Cube extends ThreeDimensionalShape {

    private final double sidesLength;

    public Cube(double sidesLength) {
        super("cube.png");
        this.sidesLength = addAttribute("Sides Length", sidesLength);
    }

    @Override
    public double getVolume() {
        return sidesLength * sidesLength * sidesLength;
    }

}
