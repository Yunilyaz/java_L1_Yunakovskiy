import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // Использование спецификаторов формата даты и времени
        System.out.printf("Час (24-часовой формат): %tH%n", date);  
        System.out.printf("Час (12-часовой формат): %tI%n", date);  
        System.out.printf("Минуты: %tM%n", date);  
        System.out.printf("Секунды: %tS%n", date);  
        System.out.printf("Полное название месяца: %tB%n", date); 
    }
}