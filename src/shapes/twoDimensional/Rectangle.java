/*
 *  CMSC 335 Project 2 "Rectangle.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the TwoDimensionalShape and is constructed by two inputs: length, and width.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getArea()
 */
package shapes.twoDimensional;

import shapes.TwoDimensionalShape;
import java.awt.Graphics;

public class Rectangle extends TwoDimensionalShape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(0, 0, (int) (length * 2.5), (int) (width * 2.5));
    }

    @Override
    public String toString() {
        return "Rectangle\nLength: " + length + "\nWidth: " +
                width + "\nArea: " + Math.round(getArea() * 1000.0) / 1000.0;
    }
}
