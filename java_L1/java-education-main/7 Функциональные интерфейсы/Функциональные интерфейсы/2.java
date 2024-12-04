// Первый интерфейс с неабстрактным методом
interface InterfaceA {
    default void show() {
        System.out.println("Show from InterfaceA");
    }
}

// Второй интерфейс с аналогичным методом
interface InterfaceB {
    default void show() {
        System.out.println("Show from InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределяем метод show() с разрешением конфликта
    @Override
    public void show() {
        // Можно выбрать, какой метод вызывать
        InterfaceA.super.show(); 
        InterfaceB.super.show(); 
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show(); // Вызовет оба метода
    }
}
