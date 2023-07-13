package OOP2.SuperKeyword;

public class SuperclassConstructor {
    public static void main(String[] args) {
        Child c1 = new Child("Andi");

    }
}

class Person {
    Person() {
        System.out.println("I am a person");
    }
    Person(String name) {
        System.out.println("Name: " + name);
    }
}

class Child extends Person {
    Child(String name) {
        //calling the parameterized constructor of the superclass
        //We can also call the default constructor with "super();"
        super(name);

        System.out.println("I am a child");
    }
}