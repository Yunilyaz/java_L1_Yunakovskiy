// Определение собственного класса исключения
public class MyFirstException extends Exception {
    // Конструктор без параметров
    public MyFirstException() {
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Констурктор на основе другого исключения
    public MyFirstException(Throwable cause) {
        super(cause);
    }

    // Конструктор от сообщения, которое может быть выведено в поток ошибок и на основе другого исключения
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    
}

