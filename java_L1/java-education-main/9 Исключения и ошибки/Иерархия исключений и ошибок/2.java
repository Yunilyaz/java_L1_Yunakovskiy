public class Main {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int result = 1 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int invalidAccess = numbers[5]; // Доступ за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        // IllegalArgumentException
        try {
            printSquareRoot(-5); // Передача некорректного аргумента
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }

        // ClassCastException
        try {
            Object obj = "susi is a wolf";
            Integer invalidCast = (Integer) obj; // Неправильное приведение типа
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        // NullPointerException
        try {
            String nullString = null;
            int length = nullString.length(); // Вызов метода на null-объекте
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}