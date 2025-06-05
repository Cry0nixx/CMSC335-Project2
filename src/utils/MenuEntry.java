/*
 *  CMSC 335 Project 2 "MenuEntry.java"
 *  Zachary Heisler
 *  6/4/2025
 *  This class allows for easy construction of menu entries that can create any kind of object based on
 *  the dynamic inputs entered by the user. The base structure of this class was given by Dr. Vergamini,
 *  the only changes made were changing the data types of the getPositiveDoubleAttribute() and getDoubleAttribute()
 *  methods which were originally named differently and returned an Integer vs. the now Double data type.
 */

package utils;
import java.util.function.Function;

public abstract class MenuEntry<Anything> {
    private final String label;

    public MenuEntry(String label) {
        this.label = label;
    }

    public String toString() {
        return label;
    }

    abstract public Anything get();

    public String getQuestion(String attributeName) {
        return "What is the " + attributeName + " for " + label + "?";
    }

    abstract public String getStringAttribute(String attributeName);

    public Double getPositiveDoubleAttribute(String attributeName) {
        return getDoubleAttribute(attributeName, (value) -> (value > 0));
    }

    public Double getDoubleAttribute(String attributeName, Function<Double, Boolean> filter) {
        final Double value = Double.valueOf(getStringAttribute(attributeName));
        if (filter == null || filter.apply(value)) {
            return value;
        }
        return null;
    }

}