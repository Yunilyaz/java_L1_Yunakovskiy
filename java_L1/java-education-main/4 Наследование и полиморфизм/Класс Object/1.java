public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, что ссылки на объекты совпадают
        if (this == obj) {
            return true;
        }
        
        // Проверяем, является ли объект экземпляром класса Point
        if (!(obj instanceof Point)) {
            return false;
        }
        
        // Приводим объект к типу Point
        Point other = (Point) obj;
        // Сравниваем координаты
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        // Генерируем hash-код на основе координат
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    // Пример использования
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 3);

        System.out.println(p1.equals(p2)); // true, координаты совпадают
        System.out.println(p1.equals(p3)); // false, координаты различаются
        System.out.println(p1.equals(null)); // false, сравнение с null
        System.out.println(p1.equals("Some String")); // false, разные типы
    }
}


/*
При реализации метода equals() важно следовать определенным соглашениям:
Симметричность: Если объект A равен объекту B, то объект B должен быть равен объекту A
Транзитивность: Если A равно B и B равно C, то A должно быть равно C
Консистентность: Многоразовые вызовы метода equals() для одного и того же объекта должны возвращать одно и то же значение
Неравенство с null: Любой объект не должен быть равен null
*/