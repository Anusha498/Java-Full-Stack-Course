package Operator;

public class Operator {
    public static void main(String[] args) {
        // Example usage of the Operator class
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;// addition operator
        int difference = num1 - num2; // subtraction operator
        int product = num1 * num2; // multiplication operator
        int quotient = num1 / num2; // division operator
        int remainder = num1 % num2; // modulus operator
        boolean isEqual = num1 == num2; // equality operator
        boolean isGreater = num1 > num2; // greater than operator
        boolean isLess = num1 < num2; // less than operator
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);

    }
}