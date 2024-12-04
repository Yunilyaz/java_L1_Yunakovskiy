// Родительский класс
class Parent {
    int value;

    // Конструктор суперкласса
    Parent(int value) {
        this.value = value;
    }

    // Метод родительского класса
    void display() {
        System.out.println("Метод display в Parent. Значение: " + value);
    }
}

// Подкласс
class Child extends Parent {
    int value; // Поле с тем же именем, что и в суперклассе

    Child(int parentValue, int childValue) {
        super(parentValue); // Вызов конструктора суперкласса
        this.value = childValue; // Инициализация поля дочернего класса
    }

    void display() {
        super.display(); // Вызов метода суперкласса
        System.out.println("Метод display в Child. Значение: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.display(); // Вызов метода, который использует super
    }
}


