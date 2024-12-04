public class Main {
    public static void main(String[] args) {
        // Создание объектов StringBuffer и StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Java");
        StringBuilder stringBuilder = new StringBuilder("World");

         // 1 append() - добавляет текст в конец строки
        stringBuilder.append(" World");
        System.out.println("append(): " + stringBuilder);  

        // 2 insert() - Вставляет строку в указанную позицию
        stringBuilder.insert(5, ",");
        System.out.println("insert(): " + stringBuilder);  

        // 3 delete() - Удаляет часть строки по индексу
        stringBuilder.delete(5, 6);
        System.out.println("delete(): " + stringBuilder); 

        // 4 reverse() - разворачивает строку
        stringBuilder.reverse();
        System.out.println("reverse(): " + stringBuilder); 

        // 5 deleteCharAt() - удаляет символ на указанной позиции
        stringBuilder.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + stringBuilder);  
        
        // 6 setLength() - устанавливает длину строки (обрезает или дополняет пробелами)
        stringBuffer.setLength(5);
        System.out.println("setLength(): " + stringBuffer);  

        // 7 capacity() - Возвращает вместимость буфера
        System.out.println("capacity(): " + stringBuffer.capacity()); 
        
        // 8 substring() - Извлекает подстроку
        String subStrBuffer = stringBuffer.substring(0, 2);
        System.out.println("substring(): " + subStrBuffer); 

        // 9 length() - Возвращает длину строки
        System.out.println("length(): " + stringBuffer.length());
        
        // 10 ensureCapacity() - Увеличивает емкость при необходимости
        stringBuffer.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + stringBuffer.capacity()); 
    }
}

    
