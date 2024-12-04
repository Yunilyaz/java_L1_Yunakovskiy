import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {9, 3, 5, 7, 6};
        int[] array3 = {5, 3, 1, 4, 2};

        System.out.println(Arrays.toString(array1)); // Преобразует массив в строковое представление

        Arrays.sort(array2);
        int index = Arrays.binarySearch(array2, 5); // Выполняет бинарный поиск в отсортированном массиве
        System.out.println(index); // Вывод индекса числа 5

        System.out.println(Arrays.equals(array1, array2)); // проверка на равенство массивов
        System.out.println(Arrays.compare(array1, array2)); // сравнивает два массива

        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
