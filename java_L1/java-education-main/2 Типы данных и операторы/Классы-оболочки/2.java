public class Main {
    public static void main(String[] args) {
        // Использование конструктора
        boolean primitiveValue = true;
        Boolean bool1 = new Boolean(primitiveValue);  
        Boolean bool1 = new Boolean(primitiveValue);  
        System.out.println("Создание через конструктор: " + bool1);  

        // Использование метода valueOf(boolean) & valueOf(string)
        Boolean bool2 = Boolean.valueOf(primitiveValue);  
        System.out.println("Создание через valueOf(boolean): " + bool2);  
        String trueString = "true";
        String falseString = "false";
        Boolean bool3 = Boolean.valueOf(trueString);   
        Boolean bool4 = Boolean.valueOf(falseString);  
        System.out.println("Создание через valueOf(String): " + bool3);  
        System.out.println("Создание через valueOf(String): " + bool4);  

        // Использование предопределенных значений Boolean.TRUE и Boolean.FALSE
        Boolean bool5 = Boolean.TRUE;  
        Boolean bool6 = Boolean.FALSE; 
        System.out.println("Создание через Boolean.TRUE: " + bool5);  
        System.out.println("Создание через Boolean.FALSE: " + bool6); 

        // Использование предопределенных значений true, false 
        Boolean bool7 = true;
        Boolean bool8 = false;
        System.out.println("Создание через автобиоксинг: " + bool7); 
        System.out.println("Создание через автобиоксинг: " + bool8);  
    }
}