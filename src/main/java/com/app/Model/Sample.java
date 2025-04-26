package com.app.Model;

import java.util.Objects;

/**
 * The Sample class is a simple model used for demonstration purposes.
 * It contains two fields: 'id' (a unique identifier) and 'text' (a string value).
 * This class is primarily used to demonstrate HTTP response handling in the Controller class.
 */
public class Sample {
    private long id;
    private String text;

    /**
     * Default constructor.
     * This constructor is provided for serialization/deserialization purposes.
     */
    public Sample(){

    }

    /**
     * Constructor to initialize a Sample object with a specific id and text.
     *
     * @param id   the unique identifier of the sample
     * @param text the text associated with the sample
     */
    public Sample(long id, String text) {
        this.id = id;
        this.text = text;
    }

    /**
     * Gets the unique identifier of the sample.
     *
     * @return the id of the sample
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the sample.
     *
     * @param id the new id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the text associated with the sample.
     *
     * @return the text of the sample
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text associated with the sample.
     *
     * @param text the new text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Compares this Sample object with another object for equality.
     * The comparison is based on the 'id' and 'text' fields.
     *
     * @param o the object to compare this Sample with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample = (Sample) o;
        return id == sample.id && Objects.equals(text, sample.text);
    }

    /**
     * Generates a hash code for the Sample object based on the 'id' and 'text' fields.
     *
     * @return the hash code for the Sample object
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }

    /**
     * Returns a string representation of the Sample object, including its 'id' and 'text' values.
     *
     * @return a string representation of the Sample object
     */
    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}