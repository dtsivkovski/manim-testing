import classes.*;

public class Main {
    
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