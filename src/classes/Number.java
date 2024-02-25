package classes;

public abstract class Number {
    private int val;

    public int getValue() {
        return val;
    }
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

}
