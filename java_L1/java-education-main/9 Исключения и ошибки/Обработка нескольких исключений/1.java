public class Main {
    public static void main(String[] args) {
        // Обработка нескольких исключений идентичным образом
        try {
            int result = 10 / 0; // ArithmeticException
            String str = null; // NullPointerException
            int length = str.length();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Исключения");
        }

        // Иерархическая обработка исключений
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("суперкласс IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("суперкласс RuntimeException");
        }
    }
}