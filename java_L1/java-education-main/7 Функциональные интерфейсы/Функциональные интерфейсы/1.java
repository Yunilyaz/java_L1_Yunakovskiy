// Интерфейс с неабстрактным и статическим методом
interface MyInterface {

    // Неабстрактный метод с реализацией
    default void display() {
        System.out.println("This is a default method in the interface.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Переопределяем неабстрактный метод интерфейса
    @Override
    public void display() {
        System.out.println("This is the overridden method in MyClass.");
    }

    public void invokeMethods() {
        // Вызов неабстрактного метода через this
        this.defaultMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass mineClass = new MyClass();

        // Вызов метода интерфейса через экземпляр
        mineClass.invokeMethods(); 

        // Вызов неабстрактного метода
        mineClass.display(); 

        // Вызов статического метода интерфейса без создания экземпляра
        MyInterface.staticMethod(); 
    }
}
