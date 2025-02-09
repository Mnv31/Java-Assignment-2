import java.util.function.Function;

public class SquareMethodReference {
    // Static method to compute square
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Using method reference to refer to the static method
        Function<Integer, Integer> squareFunction = SquareMethodReference::square;

        // Compute square of a number
        int number = 6;
        int result = squareFunction.apply(number);

        // Display result
        System.out.println("Square of " + number + " is: " + result);
    }
}
