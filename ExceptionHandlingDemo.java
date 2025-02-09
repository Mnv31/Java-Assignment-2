import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();
        
        // Demonstrating try-catch
        try {
            int result = numerator / denominator;
            System.out.println("Result using try-catch: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero!");
        }

        // Demonstrating try-catch-finally
        try {
            int result = numerator / denominator;
            System.out.println("Result using try-catch-finally: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in try-catch-finally: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block executed: Cleanup operations or resource closing.");
        }

        scanner.close();
    }
}
