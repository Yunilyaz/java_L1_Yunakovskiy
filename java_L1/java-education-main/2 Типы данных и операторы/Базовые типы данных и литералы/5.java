public class Main {
    public static void main(String[] args) {
        byte b1 = 8;
        int i1 = 64;
        double d1 = 0.3d;

        byte b2 = b1 + 10; // ошибка incompatible types
        int i2 = i1 + 101.0f;  // ошибка incompatible types
        double result = b1 + i1 + d1;
        //Объяснение: все операнды приводятся к типу с наибольшей точностью. В арифметических операциях выполняются только расширяющиеся преобразования
    }
}



