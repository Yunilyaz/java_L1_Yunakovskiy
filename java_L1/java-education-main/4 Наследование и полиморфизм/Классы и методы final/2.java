final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка наследовать final класс
class SubClass extends FinalClass { // Эта строка вызовет ошибку компиляции
    public void show() {
        System.out.println("Trying to subclass final class.");
    }
}

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();

        // Это не скомпилируется из-за ошибки в наследовании
        // SubClass subObj = new SubClass();
        // subObj.show();
    }
}
