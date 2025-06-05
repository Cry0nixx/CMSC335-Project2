/*
 *  CMSC 335 Project 2 "Cone.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: radius, and height.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Cone extends ThreeDimensionalShape {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        shapeImage = new ImageIcon("src/images/cone.png");
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone\nRadius: " + radius + "\nHeight: " + height + "\nVolume: " + Math.round(getVolume() * 1000.0) / 1000.0;
    }
}
