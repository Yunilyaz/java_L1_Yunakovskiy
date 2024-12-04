class Calculator {
    // Метод для сложения целых чисел с переменным числом параметров
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Метод для сложения чисел с плавающей запятой с переменным числом параметров
    public double add(double... numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Метод для сложения объектов String с переменным числом параметров
    public String add(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(" ");
        }
        return result.toString().trim();
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Пример использования метода с переменным числом параметров для целых чисел
        int sumInt = calculator.add(1, 2, 3, 4, 5);
        System.out.println("Сумма целых чисел: " + sumInt);

        // Пример использования метода с переменным числом параметров для дробных чисел
        double sumDouble = calculator.add(0.5, 2.2, 3.77);
        System.out.println("Сумма вещественных чисел: " + sumDouble);

        // Пример использования метода с переменным числом параметров для строк
        String stringSum = calculator.add("Hello", "world", "from", "Java");
        System.out.println("Объединённые строки: " + stringSum);
    }
}
