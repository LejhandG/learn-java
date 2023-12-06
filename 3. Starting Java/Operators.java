// This is a simple Java program to demonstrate different operators in Java

public class Operators {

    public static void main(String[] args) {
        // Arithmetic operators
        int num1 = 10;
        int num2 = 5;

        // Addition operator (+): Adds two values
        int sum = num1 + num2;

        // Subtraction operator (-): Subtracts the second value from the first
        int difference = num1 - num2;

        // Multiplication operator (*): Multiplies two values
        int product = num1 * num2;

        // Division operator (/): Divides the first value by the second
        int quotient = num1 / num2;

        // Modulus operator (%): Returns the remainder of the division
        int remainder = num1 % num2;

        // Displaying results of arithmetic operations
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        System.out.println("\nRelational Operators:");

        // Greater than operator (>): Checks if the first value is greater than the second
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));

        // Less than operator (<): Checks if the first value is less than the second
        System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));

        // Greater than or equal to operator (>=): Checks if the first value is greater than or equal to the second
        System.out.println(num1 + " >= " + num2 + ": " + (num1 >= num2));

        // Less than or equal to operator (<=): Checks if the first value is less than or equal to the second
        System.out.println(num1 + " <= " + num2 + ": " + (num1 <= num2));

        // Equal to operator (==): Checks if two values are equal
        System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));

        // Not equal to operator (!=): Checks if two values are not equal
        System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));

        // Logical operators
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("\nLogical Operators:");

        // Logical AND operator (&&): Returns true if both conditions are true
        System.out.println(isTrue + " && " + isFalse + ": " + (isTrue && isFalse));

        // Logical OR operator (||): Returns true if at least one condition is true
        System.out.println(isTrue + " || " + isFalse + ": " + (isTrue || isFalse));

        // Logical NOT operator (!): Returns true if the condition is false and vice versa
        System.out.println("!" + isTrue + ": " + !isTrue);

        // Increment and Decrement operators
        int count = 5;
        System.out.println("\nIncrement and Decrement Operators:");

        // Increment operator (++): Increases the value by 1
        System.out.println("Original Count: " + count);
        count++;
        System.out.println("After Increment: " + count);

        // Decrement operator (--): Decreases the value by 1
        count--;
        System.out.println("After Decrement: " + count);

        // Assignment operators
        int value = 10;
        System.out.println("\nAssignment Operators:");

        // Addition assignment operator (+=): Adds the right operand to the left operand and assigns the result to the left operand
        System.out.println("Original Value: " + value);
        value += 5;
        System.out.println("After += 5: " + value);

        // Multiplication assignment operator (*=): Multiplies the right operand with the left operand and assigns the result to the left operand
        value *= 2;
        System.out.println("After *= 2: " + value);
    }
}
