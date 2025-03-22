import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicate, will not be added
        System.out.println(names); // Output: Order may vary
        
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(42);
        numbers.add(5);
        numbers.add(19);
        System.out.println(numbers); // Output: [5, 19, 42]
    }
}
