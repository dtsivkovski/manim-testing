package classes;


/**
* NaturalNumber defines a natural number value, 0 or greater. This is to be used for strict typing.
* 
* @author Daniel Tsivkovski
* 
*/
public class NaturalNumber extends Number {
    private int val;

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
    
}
 