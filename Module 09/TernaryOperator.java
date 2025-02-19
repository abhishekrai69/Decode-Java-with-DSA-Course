/* The ternary operator is a conditional operator that takes three operands: a condition, a value to be returned if the condition is true, 
and a value to be returned if the condition is false. it is an replacement for if-else */
public class TernaryOperator {
    public static void main(String[] args) {
        // Define two variables
        int a = 5;
        int b = 9;

        // Use ternary operator to find the maximum
        int max = (a > b) ? a : b;

        // Output the maximum value
        System.out.println("Maximum: " + max); // Output: Maximum: 9
    }
}
