import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsDescending {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Orange");
        words.add("Banana");
        words.add("Grapes");
        words.add("Mango");

        // Sort the list in descending order using a lambda expression
        words.sort((s1, s2) -> s2.compareTo(s1));

        // Display the sorted list
        System.out.println("Sorted list in descending order: " + words);
    }
}
