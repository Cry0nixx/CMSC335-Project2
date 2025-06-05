/*
 *  CMSC 335 Project 2 "ShapeDisplayPanel.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class creates the entire GUI for the application, it designs the layout, dropdown content, and the
 *  functionality of swing components. Its purpose is to be able to create various shapes and find their area
 *  and draw the shape for the user to see.
 */

package ui.panels;

import shapes.Shape;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ShapeDisplayPanel extends JPanel {

    private final DrawingPanel drawingPanel = new DrawingPanel();
    private final JTextArea area = new JTextArea();

    public ShapeDisplayPanel() {
        super(new BorderLayout(10, 10));

        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        area.setEditable(false);
        area.setSize(new Dimension(100, 100));
        add(area, BorderLayout.LINE_START);
        add(drawingPanel,BorderLayout.CENTER);
    }

    public void setShape(Shape shape) {
        area.setText(shape.toString());
        drawingPanel.currentShape = shape;
        repaint();
    }
}



