/*
 *  CMSC 335 Project 2 "Square.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the TwoDimensionalShape and is constructed by one input: side.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getArea()
 */
package shapes.twoDimensional;

import shapes.TwoDimensionalShape;
import java.awt.Graphics;

public class Square extends TwoDimensionalShape {

    private final double sidesLength;

    public Square(double sidesLength) {
        this.sidesLength = addAttribute("Sides Length", sidesLength);
    }

    @Override
    public double getArea() {
        return sidesLength * sidesLength;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(0, 0, (int) (sidesLength * 2.5), (int) (sidesLength * 2.5));
    }

}
