enum Student {
    ALGEBRY(5),
    RUS(4),
    PHISICS(2),

    private final int degree; // оценка по предмету

    // Конструктор
    Student(int degree) {
        this.degree = degree;
    }

    // Метод для получения оценок студента
    public int getDegree() {
        return degree;
    }

    public static void main(String[] args) {
        for (Student studebt : Student.values()) {
            System.out.printf("Оценка %s: %n", student, student.getDegree());
        }
    }
}


