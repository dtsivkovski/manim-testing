package classes;


/**
* NaturalNumber defines a natural number value, 0 or greater. This is to be used for strict typing.
* 
* @author Daniel Tsivkovski
* 
*/
public class NaturalNumber extends BaseNumber {
    protected int val;

    /**
     * Default constructor that initializes a natural number with a value of 0.
     */
    public NaturalNumber() {
        this.val = 0;
    }
    /**
     * Creates a natural number object.
     * @param value the value of the natural number. Will override to zero if a negative value is passed in.
     */
    public NaturalNumber(int value) {
        // checks if value is less than zero
        if (value < 0) this.val = 0;
        else this.val = value;
    }
    /**
     * Creates a natural number object from a number.
     * @param n the number object whose value will be copied to the Natural Number.
     */
    public NaturalNumber(BaseNumber n) {
        if (n.getValue() < 0) this.val = 0;
        else this.val = n.getValue();
    }

    /**
     * For retrieving the value of the natural number
     * @return the value of the natural number
     */
    public int getValue() {
        return this.val;
    }

    /**
     * Successor function of the current numerical value
     * @return The numerical value plus one (otherwise known as a successor)
     */
    public int getSuccessor() {
        return (this.val + 1);
    }

    /**
     * Updates the value of the current numerical value to its successor
     */
    public void updateToSuccessor() {
        this.val += 1;
    }

    /**
     * For changing the value of the natural number
     * @param value the new value for the natural number. Will override to zero if a negative value is passed in.
     */
    public void setValue(int value) {
        // checks if value is less than zero
        if (value < 0) this.val = 0;
        else this.val = value;
    }

    public static void main(String[] args) {
        
        // Test constructor and getValue
        NaturalNumber num1 = new NaturalNumber(5);
        System.out.println("Expected: 5, Actual: " + num1.getValue());

        NaturalNumber num2 = new NaturalNumber(0);
        System.out.println("Expected: 0, Actual: " + num2.getValue());

        NaturalNumber num3 = new NaturalNumber(-3);
        System.out.println("Expected: 0, Actual: " + num3.getValue());

        // Test getSuccessor
        System.out.println("Expected: 6, Actual: " + num1.getSuccessor());

        // Test updateToSuccessor
        num1.updateToSuccessor();
        System.out.println("Expected: 6, Actual: " + num1.getValue());

        // Test setValue
        num1.setValue(10);
        System.out.println("Expected: 10, Actual: " + num1.getValue());

        num1.setValue(-5);
        System.out.println("Expected: 0, Actual: " + num1.getValue());

    }
    
}
 