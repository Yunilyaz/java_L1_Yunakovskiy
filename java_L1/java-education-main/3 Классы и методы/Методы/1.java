// Overload пример
class Calculator {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения целого числа и числа с плавающей точкой
    public double add(int a, double b) {
        return a + b;
    }
}

/// Override пример
class Animal {
    // Родительский метод
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Cat extends Animal {
    // Переопределенный метод
    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal myCat = new Cat();  // Ссылается на объект типа Cat

        // Вызов переопределенного метода
        myCat.sound();  
    }
}
