/*
 *  CMSC 335 Project 2 "Shape.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class is the blueprint model class used to extend shapes of different dimensions.
 *  It is used in the creation of TwoDimensionalShape and ThreeDimensionalShape takes in one
 *  int value, numberOfDimensions which represent the number of dimensions the shape has.
 *  (e.g. TwoDimensionalShape is 2, and ThreeDimensionalShape is 3). All shapes must implement a draw()
 *  method allowing them to be drawn in the GUI.
 */
package shapes;

import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Shape implements Serializable {

    public final int numberOfDimensions;
    public ImageIcon shapeImage;

    Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(shapeImage.getImage(),  0,  0,  null);
    }

}
