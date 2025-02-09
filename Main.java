// File: utilities/MathUtils.java
package utilities;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
// File: Main.java
import utilities.MathUtils;

public class MainSum {
    public static void main(String[] args) {
        int sum = MathUtils.add(100, 20);
        System.out.println("Sum: " + sum);
    }
}
