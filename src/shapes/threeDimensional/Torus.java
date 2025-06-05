/*
 *  CMSC 335 Project 2 "Torus.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class extends the ThreeDimensionalShape and is constructed by two inputs: innerRadius and outerRadius
 *  It's both serializable, can be drawn with draw(), and can calculate its volume getVolume()
 */
package shapes.threeDimensional;

import shapes.ThreeDimensionalShape;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Torus extends ThreeDimensionalShape {

    private final double innerRadius;
    private final double outerRadius;

    public Torus(double innerRadius, double outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        shapeImage = new ImageIcon("src/images/torus.png");
        shapeImage = new ImageIcon(shapeImage.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH));
    }

    @Override
    public double getVolume() {
        return 2.0 * Math.PI * Math.PI * outerRadius * innerRadius * innerRadius;
    }

    @Override
    public String toString() {
        return "Torus\nInner Radius: " + innerRadius + "\nOuter Radius: " +
                outerRadius + "\nVolume: " + Math.round(getVolume() * 1000.0) / 1000.0;
    }
}
