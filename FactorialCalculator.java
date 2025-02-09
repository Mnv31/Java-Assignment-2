// Custom Exception Class for Negative Numbers
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class FactorialCalculator {
    // Method to calculate factorial using throws
    public static int factorial(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Factorial is not defined for negative numbers!");
        }
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = -5; // Change this value to test different cases

        try {
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
