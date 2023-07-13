package OOP2.MethodOverriding;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.displayInfo();
        d1.displayInfo();
    }
}

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}