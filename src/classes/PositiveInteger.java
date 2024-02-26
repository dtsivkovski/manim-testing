package classes;

/**
 * PositiveInteger is a numerical value of 1 or greater
 */
public class PositiveInteger extends NaturalNumber {

    /**
     * Creates a default positive integer with a value of 1.
     */
    public PositiveInteger() {
        super();
        this.val = 1;
    }
    /**
     * Creates a positive number with a value of 1 or greater
     * @param value Value of the positive number, defaults to 1 if zero or lower
     */
    public PositiveInteger(int value) {
        super();
        if (value <= 0) this.val = 1;
        else this.val = value;
    }
    /**
     * Creates a positive number with a value of 1 or greater from an existing number object
     * @param n An existing number object whose value is to be copied 
     */
    public PositiveInteger(BaseNumber n) {
        super();
        if (n.getValue() <= 0) this.val = 1;
        else this.val = n.getValue();
    }
    
    /**
     * For changing the value of the positive integer
     * @param value the new value for the positive number. Will override to 1 if a non-positive value is passed in.
     */
    public void setValue(int value) {
        // checks if value is less than zero
        if (value <= 0) this.val = 1;
        else this.val = value;
    }


    // testing method
    public static void main(String[] args) {
        
        // Test constructor and getValue
        PositiveInteger num1 = new PositiveInteger(5);
        System.out.println("Expected: 5, Actual: " + num1.getValue());

        PositiveInteger num2 = new PositiveInteger(0);
        System.out.println("Expected: 1, Actual: " + num2.getValue());

        PositiveInteger num3 = new PositiveInteger(-3);
        System.out.println("Expected: 1, Actual: " + num3.getValue());

        // Test getSuccessor
        System.out.println("Expected: 6, Actual: " + num1.getSuccessor());

        // Test updateToSuccessor
        num1.updateToSuccessor();
        System.out.println("Expected: 6, Actual: " + num1.getValue());

        // Test setValue
        num1.setValue(10);
        System.out.println("Expected: 10, Actual: " + num1.getValue());

        num1.setValue(-5);
        System.out.println("Expected: 1, Actual: " + num1.getValue());

    }
}
