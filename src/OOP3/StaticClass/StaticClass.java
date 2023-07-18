package OOP3.StaticClass;

public class StaticClass {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
        //mammal.eat();     won't work because we can't access non-static methods with a static class object
    }
}

class Animal {
    static class Mammal {
        // static and non-static members of Mammal
        public void displayInfo() {
            System.out.println("I am a mammal!");
        }
    }
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile!");
        }

    }
    //members of Animal
    public void eat() {
        System.out.println("I eat food.");
    }
}