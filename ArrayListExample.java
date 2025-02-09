import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the elements of the ArrayList
        System.out.println("List of numbers: " + numbers);

        // Using a loop to print each number separately
        System.out.println("Numbers in the list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
