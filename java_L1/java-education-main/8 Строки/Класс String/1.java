public class Main {
    public static void main(String[] args) {
        String str = "Hello, Java World!";
        String strWithSpaces = "   Hello, Java World!   ";
        String strSame = "Hello, Java World!";

        // 1 length() - возвращает длину строки.
        System.out.println("Length of the string: " + str.length()); 
        
        // 2 charAt(int index) - возвращает символ, находящийся по указанному индексу.
        System.out.println("Character at index 5 in the string: " + str.charAt(5)); 

        // 3 toUpperCase() - преобразует строку в верхний регистр.
        System.out.println("Uppercase version: " + str.toUpperCase()); 

        // 4 toLowerCase() - преобразует строку в нижний регистр.
        System.out.println("Lowercase version: " + str.toLowerCase()); 

        // 5 substring(int index) - извлекает подстроку, начиная с указанного индекса
        System.out.println("Substring from index 7 : " + str.substring(7)); 

        // 6 indexOf(String str) - возвращает индекс первого вхождения подстроки.
        System.out.println("Index of 'Java': " + str.indexOf("Java")); 

        // 7 replace(char oldChar, char newChar) - заменяет все вхождения одного символа или подстроки на другой
        System.out.println("Replace 'Java' with 'C++': " + str.replace('Java', 'C++')); 

        // 8 trim() - удаляет пробелы с начала и конца строки.
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'"); 

        // 9 contains(CharSequence sequence) - проверяет, содержит ли строка указанную последовательность.
        System.out.println("Contains 'Java': " + str.contains("Java")); 

        // 10 equals() - Сравнивает строки на равенство
        System.out.println("str equals strSame: " + str.equals(strSame));
    }
}