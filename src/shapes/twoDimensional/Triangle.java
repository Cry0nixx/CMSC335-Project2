/*
 *  CMSC 335 Project 2 "Triangle.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the  TwoDimensionalShape and is constructed by two inputs: base and height.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getArea()
 */
package shapes.twoDimensional;

import shapes.TwoDimensionalShape;
import java.awt.Graphics;

public class Triangle extends TwoDimensionalShape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = addAttribute("Base", base);
        this.height = addAttribute("Height", height);
    }

    @Override
    public double getArea() {
        return (1.0 / 2.0) * base * height;
    }

    @Override
    public void draw(Graphics graphics) {
        int[] x = {0, 0, (int) (base * 2.5)};
        int[] y = {0, (int) (height * 2.5), (int) (height * 2.5)};
        graphics.fillPolygon(x, y, 3);
    }

}
