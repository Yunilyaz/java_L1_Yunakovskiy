import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // Пример использования спецификатора %b для логического значения
        boolean boolValue = true;
        System.out.printf("Логическое значение: %b%n", boolValue);

        // Пример использования спецификатора %c для символа
        char charValue = 'A';
        System.out.printf("Character value: %c%n", charValue);

        // Пример использования спецификатора %d для десятичного целого числа
        int intValue = 123;
        System.out.printf("Integer value: %d%n", intValue);

        // Пример использования спецификатора %f для числа с плавающей точкой
        double doubleValue = 12.345;
        System.out.printf("Double value: %f%n", doubleValue);

        // Пример использования спецификатора %s для строкового представления
        String stringValue = "Hello, Formatter!";
        System.out.printf("Строка: %s%n", stringValue);

        // Освобождение ресурсов
        formatter.close();
    }
}
