/*
 *  CMSC 335 Project 2 "DrawingPanel.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class creates the entire GUI for the application, it designs the layout, dropdown content, and the
 *  functionality of swing components. Its purpose is to be able to create various shapes and find their area
 *  and draw the shape for the user to see.
 */

package ui.panels;

import shapes.Shape;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class DrawingPanel extends JPanel {

    protected Shape currentShape = null;

    public DrawingPanel() {
        super();
        setMinimumSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (currentShape != null)
            currentShape.draw(graphics);
    }
}