class Parent {
    public void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // Без @Override компилятор не проверит названия функций, несмотря на то, что метод назван некорректно
    // @Override
    public void Method() {
    // Ошибка: метод не переопределяет ничего в суперклассе
    // public void Metho() {
        System.out.println("Child");
    }
}

// Таким образом, использование аннотации @Override помогает предотвратить ошибки при переопределении методов и делает код более понятным