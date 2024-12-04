public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Второе исключение не будет перехвачено
        int result = 10 / 0; // ArithmeticException
    }
}