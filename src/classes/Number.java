package classes;

public class Number {

    private int val;

    /**
     * Default constructor for a Number object, defaults to a value of 0.
     */
    public Number() {
        this.val = 0;
    }

    /**
     * Constructor for a value for a number
     * @param value the numerical value for the number
     */
    public Number(int value) {
        this.val = value;
    }

    /**
     * Returns the value of the number
     * @return the value of the number
     */
    public int getValue() {
        return val;
    }
    /**
     * Changes the value of the number to the given parameter
     * @param value the new value for the number
     */
    public void setValue(int value) {
        this.val = value;
    }

    /**
     * Comparison between number objects
     * @param o Other object with the title 
     * @return Integer for comparison value as defined by compareTo
     */
    public int compareTo(Number o) {
        // can only compare numbers
        if (this.val > o.val) {
            return 1;
        }
        else if (this.val == o.val) {
            return 0;
        }
        else {
            return -1;
        }
    }

    /**
     * Comparison between the object and an integer value
     * @param value Integer value for comparison
     * @return Integer for comparison value as defined by compareTo
     */
    public int compareTo(int value) {
        if (this.val > value) {
            return 1;
        }
        else if (this.val == value) {
            return 0;
        }
        else {
            return -1;
        }
    }

    /**
     * Compares the objects to determine if they are equal or not.
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Number)) {
            return false;
        }
        // Cast to number and check
        Number number = (Number) o;
        return val == number.val;
    }

}
