package classes;

public class BaseNumber {

    private int val;

    /**
     * Default constructor for a Number object, defaults to a value of 0.
     */
    public BaseNumber() {
        this.val = 0;
    }

    /**
     * Constructor for a value for a number
     * @param value the numerical value for the number
     */
    public BaseNumber(int value) {
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
    public int compareTo(BaseNumber o) {
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
        if (!(o instanceof BaseNumber)) {
            return false;
        }
        // Cast to number and check
        BaseNumber number = (BaseNumber) o;
        return val == number.val;
    }

    // main testing method
    public static void main(String[] args) {

        // Test constructor and getValue
        BaseNumber num1 = new BaseNumber(5);
        System.out.println("Expected: 5, Actual: " + num1.getValue());

        BaseNumber num2 = new BaseNumber(0);
        System.out.println("Expected: 0, Actual: " + num2.getValue());

        BaseNumber num3 = new BaseNumber(-3);
        System.out.println("Expected: -3, Actual: " + num3.getValue());

        // Test setValue
        num1.setValue(10);
        System.out.println("Expected: 10, Actual: " + num1.getValue());

        num1.setValue(-5);

    }

}
