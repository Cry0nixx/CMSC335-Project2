/*
 *  CMSC 335 Project 2 "Cylinder.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: radius, and height.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Cylinder extends ThreeDimensionalShape {

    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        shapeImage = new ImageIcon("src/images/cylinder.png");
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));

    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder\nRadius: " + radius + "\nHeight: " + height + "\nVolume: " + Math.round(getVolume() * 1000.0) / 1000.0;
    }
}
