package example;

class Main {
    
    // public - доступен из любого места
    public int publicField = 1;
    // protected - доступен внутри пакета и наследникам
    protected int protectedField = 2;
    // private - доступен только внутри класса
    private int privateField = 3;
    // default (пакетный доступ) - доступен внутри пакета
    int defaultField = 4;

    public void publicMethod() {
        System.out.println("Public method called.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    private void privateMethod() {
        System.out.println("Private method called.");
    }

    void defaultMethod() {
        System.out.println("Default method called.");
    }
}

class Tests {
    public static void main(String[] args) {
        AccessModifiersExample modi = new AccessModifiersExample();
        // Доступ к полям и методам
        System.out.println("Public field: " + modi.publicField); 
        System.out.println("Protected field: " + modi.protectedField); 
        System.out.println("Default field: " + modi.defaultField); 
        System.out.println("Private field: " + modi.privateField); 

        modi.publicMethod(); 
        modi.protectedMethod(); 
        modi.defaultMethod(); 
        modi.privateMethod(); 
    }
}