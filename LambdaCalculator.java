@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        // Lambda expressions for different operations
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        // Performing operations
        int x = 10, y = 5;
        System.out.println("Addition: " + addition.compute(x, y));
        System.out.println("Subtraction: " + subtraction.compute(x, y));
        System.out.println("Multiplication: " + multiplication.compute(x, y));
    }
}
