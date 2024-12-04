
public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Integer number = 42;

        // Использование instanceof
        boolean is_string = text instanceof String;
        boolean is_integer = number instanceof Integer;
        System.out.println("text instanceof String: " + is_string);
        System.out.println("number instanceof Integer: " + is_integer);

        // null-объект
        String null_string = null;
        boolean is_null_string = null_string instanceof String;
        System.out.println("null instanceof String: " + is_null_string);
    }
}

    public static void main(String[] args) {
        // Примеры объектов
        Object obj = "Hello, world!"; // Объект типа String
        String str = "Java";
        Integer num = 42;

        