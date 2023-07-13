package OOP2.MethodOverriding;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.displayInfo();
        System.out.println();
        d1.displayInfo();
    }
}

class Animal {
    public void displayInfo() {
        System.out.println("This is a method call of the superclass");
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("This is a method call of the subclass");
        super.displayInfo();                //super keyword is used to call the method of the superclass
        System.out.println("I am a dog.");
    }
}