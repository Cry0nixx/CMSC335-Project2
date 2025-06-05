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

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(0, 0, (int) (side * 2.5), (int) (side * 2.5));
    }

    @Override
    public String toString() {
        return "Square\nSides Length: " + side + "\nArea: " + Math.round(getArea() * 1000.0) / 1000.0;
    }
}
