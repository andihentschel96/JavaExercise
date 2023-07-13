package OOP2.AbstractClassAndMethods;

public class AbstractClass {
    public static void main(String[] args) {
        //'Language' is abstract; cannot be instantiated
        //Language object = new Language();
    }
}

//create an abstract class
abstract class Language {
    //abstract method
    abstract void Method1();
    //regular method
    void method2() {
        System.out.println("This is a regular method.");
    }
}