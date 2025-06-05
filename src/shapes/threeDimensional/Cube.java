/*
 *  CMSC 335 Project 2 "Cube.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by one input: side.
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Cube extends ThreeDimensionalShape {

    private final double side;

    public Cube(double side) {
        this.side = side;
        shapeImage = new ImageIcon("src/images/cube.png");
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube\nSides Length: " + side + "\nVolume: " + Math.round(getVolume() * 1000.0) / 1000.0;
    }
}
