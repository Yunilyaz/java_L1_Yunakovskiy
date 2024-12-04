//Инициализация при объявлении
public class A {
    public final int a = 10;
}

//Инициализация через конструктор
public class A {
    public final int a;

    public A(int value) {
        a = value;
    }
}

//Инициализация в блоке инициализации
public class A {
    public final int a;

    {
        a = 10;
    }
}




/