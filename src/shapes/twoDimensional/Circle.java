/*
 *  CMSC 335 Project 2 "Circle.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the TwoDimensionalShape and is constructed by one input: radius.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getArea()
 */
package shapes.twoDimensional;

import shapes.TwoDimensionalShape;
import java.awt.Graphics;

public class Circle extends TwoDimensionalShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = addAttribute("Radius", radius);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillOval(0, 0, (int) (radius * 2.5), (int) (radius * 2.5));
    }

}
