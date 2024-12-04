import java.util.StringJoiner;

public class Example {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");
        
        System.out.println(joiner.toString()); // Вывод: Apple, Banana, Orange
    }
}
