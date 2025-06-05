/*
 *  CMSC 335 Project 2 "Sphere.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by one input: radius.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
        shapeImage = new ImageIcon("src/images/sphere.png");
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));

    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere\nRadius: " + radius + "\nVolume: " + Math.round(getVolume() * 1000.0) / 1000.0;
    }
}
