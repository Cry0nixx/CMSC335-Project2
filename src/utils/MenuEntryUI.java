/*
 *  CMSC 335 Project 2 "MenuEntryUI.java"
 *  Zachary Heisler
 *  6/4/2025
 *  Extends MenuEntry and is used to provide a GUI Pane with the question and a text field for an input. Class
 *  blueprint made by Dr. Vergamini, only change I made was the type of MenuEntry<?> the class extended, which in
 *  this case is a Shape.
 */

package utils;
import shapes.Shape;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

public abstract class MenuEntryUI extends MenuEntry<Shape> {

    public MenuEntryUI(String label) {
        super(label);
    }

    @Override
    public String getStringAttribute(String parameterName) {
        final JTextField parameterInputTextField = new JTextField();
        JOptionPane.showMessageDialog(null, parameterInputTextField, getQuestion(parameterName),
                JOptionPane.QUESTION_MESSAGE);
        return parameterInputTextField.getText();
    }
}