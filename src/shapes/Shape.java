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

import java.awt.Graphics;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Shape implements Serializable {

    public final int numberOfDimensions;
    private final Map<String, Double> attributes = new LinkedHashMap<>();

    Shape(int numberOfDimensions) {
        this.numberOfDimensions = numberOfDimensions;
    }

    public abstract void draw(Graphics graphics);

    public double addAttribute(String attributeName, double attributeValue) {
        if (attributeName != null && !attributeName.isBlank()) {
            attributes.put(attributeName, attributeValue);
        }
        return attributeValue;
    }

    @Override
    public String toString() {
        StringBuilder attributesString = new StringBuilder();
        for (Map.Entry<String, Double> entry : attributes.entrySet()) {
            attributesString.append("\n").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        return this.getClass().getSimpleName() + attributesString;
    }

}
