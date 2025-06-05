/*
 *  CMSC 335 Project 2 "ShapesUI.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class creates the entire GUI for the application, it designs the layout, dropdown content, and the
 *  functionality of swing components. Its purpose is to be able to create various shapes and find their area
 *  and draw the shape for the user to see.
 */

package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import shapes.*;
import shapes.threeDimensional.*;
import shapes.twoDimensional.*;

import ui.panels.ShapeDisplayPanel;
import utils.MenuEntry;
import utils.MenuEntryUI;

public class ShapesUI extends JFrame implements ActionListener {

    ///
    /// Creates all 9 Shape MenuEntry's defining shape name, attributes needed,
    /// and object constructed from MenuEntry.
    ///

    private final static MenuEntry<Shape> circleEntry = new MenuEntryUI("Circle") {

        @Override
        public Shape get() {
            return new Circle(getPositiveDoubleAttribute("radius"));
        }

    };

    private final static MenuEntry<Shape> coneEntry = new MenuEntryUI("Cone") {

        @Override
        public Shape get() {
            return new Cone(getPositiveDoubleAttribute("radius"), getPositiveDoubleAttribute("height"));
        }

    };

    private final static MenuEntry<Shape> cubeEntry = new MenuEntryUI("Cube") {

        @Override
        public Shape get() {
            return new Cube(getPositiveDoubleAttribute("side"));
        }

    };

    private final static MenuEntry<Shape> cylinderEntry = new MenuEntryUI("Cylinder") {

        @Override
        public Shape get() {
            return new Cylinder(getPositiveDoubleAttribute("radius"), getPositiveDoubleAttribute("height"));
        }

    };

    private final static MenuEntry<Shape> rectangleEntry = new MenuEntryUI("Rectangle") {

        @Override
        public Shape get() {
            return new Rectangle(getPositiveDoubleAttribute("length"), getPositiveDoubleAttribute("width"));
        }

    };

    private final static MenuEntry<Shape> sphereEntry = new MenuEntryUI("Sphere") {

        @Override
        public Shape get() {
            return new Sphere(getPositiveDoubleAttribute("radius"));
        }

    };

    private final static MenuEntry<Shape> squareEntry = new MenuEntryUI("Square") {

        @Override
        public Shape get() {
            return new Square(getPositiveDoubleAttribute("sides length"));
        }

    };

    private final static MenuEntry<Shape> torusEntry = new MenuEntryUI("Torus") {

        @Override
        public Shape get() {
            return new Torus(getPositiveDoubleAttribute("inner radius"), getPositiveDoubleAttribute("outer radius"));
        }

    };

    private final static MenuEntry<Shape> triangleEntry = new MenuEntryUI("Triangle") {

        @Override
        public Shape get() {
            return new Triangle(getPositiveDoubleAttribute("base"), getPositiveDoubleAttribute("height"));
        }

    };

    private final ShapeDisplayPanel shapeDisplayPanel = new ShapeDisplayPanel();
    private final Map<String, MenuEntry<Shape>> suppliers = new TreeMap<>();
    private final JComboBox<String> shapeChoices;

    /**
     * Constructs the ShapesUI used to select and draw shapes
     * of various measurements based on user graphical input.
     */
    public ShapesUI() {
        // Name of GUI window (JFrame)
        super("Shape Builder and Visualizer");

        // Maps the shape entries to a Map of String keys and MenuEntry<Shape> values
        suppliers.put(circleEntry.toString(), circleEntry);
        suppliers.put(coneEntry.toString(), coneEntry);
        suppliers.put(cubeEntry.toString(), cubeEntry);
        suppliers.put(cylinderEntry.toString(), cylinderEntry);
        suppliers.put(rectangleEntry.toString(), rectangleEntry);
        suppliers.put(sphereEntry.toString(), sphereEntry);
        suppliers.put(squareEntry.toString(), squareEntry);
        suppliers.put(torusEntry.toString(), torusEntry);
        suppliers.put(triangleEntry.toString(), triangleEntry);

        // Assigns this map to the JComboBox making the dropdown
        shapeChoices = new JComboBox<>(suppliers.keySet().toArray(new String[0]));

        // Creates and assigns the implemented ActionListener to the createButton variable
        final JButton createButton = new JButton("Create Shape");
        createButton.addActionListener(this);

        // Creates a controlPanel, used to create the top panel that has the shapes dropdown and create button
        final JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(shapeChoices);
        controlPanel.add(createButton);

        // Defines attributes for the JFrame extended to this class.
        setLayout(new BorderLayout());
        add(controlPanel, BorderLayout.NORTH);
        add(shapeDisplayPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(700, 700));
    }

    /**
     * Creates a shape on the shapeDisplayPanel, the center largest panel where shapes are drawn/visualized.
     * @param shapeName name of the shape used for error logging.
     * @param menuEntry menu entry of the shape used to get the shape object and attempt drawing it.
     */
    private void createShape(String shapeName, MenuEntry<Shape> menuEntry) {
        try {
            shapeDisplayPanel.setShape(menuEntry.get());
        } catch (Exception inputError) {
            JOptionPane.showMessageDialog(null, "Invalid shape: " + shapeName, null, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Overrides ActionListener method to add logic to when the button is clicked. On click the Shape object is
     * serialized to show the attributes of the shape, and the createShape() method is called to attempt the
     * drawing/visualization of the shape on the GUI.
     * @param ignored the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent ignored) {
        final String key = Objects.requireNonNull(shapeChoices.getSelectedItem()).toString();
        createShape(key, suppliers.get(key));
    }

}
