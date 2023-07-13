package OOP2.SuperKeyword;

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printMessage();
    }
}

class Animal {
    public void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    //overriding the superclass method

    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        //call of the overriding method
        display();

        //call of the overridden method
        super.display();
    }
}