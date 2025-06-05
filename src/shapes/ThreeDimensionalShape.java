/*
 *  CMSC 335 Project 2 "ThreeDimensionalShape.java"
 *  Zachary Heisler
 *  6/4/2025
 *  The ThreeDimensionalShape class is an abstract class constructed as a shape with 3 dimensions.
 *  This class contains one required abstract method getVolume() whose purpose is to return a double
 *  that represents the volume of the shape that extends this class (e.g. Sphere or Torus)
 */
package shapes;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public abstract class ThreeDimensionalShape extends Shape {

    public ImageIcon shapeImage;

    public ThreeDimensionalShape(String imageName) {
        super(3);
        shapeImage = new ImageIcon("src/images/" + imageName);
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
    }

    public abstract double getVolume();

    public void draw(Graphics graphics) {
        graphics.drawImage(shapeImage.getImage(),  0,  0,  null);
    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume: " + (Math.round(getVolume() * 1000.0) / 1000.0);
    }

}
