class Calculator {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения целого числа и числа с плавающей точкой
    public double add(int a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения массива чисел
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сумма двух целых: " + calc.add(3, 7)); 
        System.out.println("Сумма трех целых: " + calc.add(5, 10, 15)); 
        System.out.println("Сумма двух дробных: " + calc.add(5.5, 10.5)); 
        System.out.println("Сумма целого и дробного числа: " + calc.add(3, 4.5)); 
        System.out.println("Сумма чисел массива: " + calc.add(new int[]{1, 2, 3, 4})); 
    }
}
