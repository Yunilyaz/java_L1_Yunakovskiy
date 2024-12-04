// Override пример
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