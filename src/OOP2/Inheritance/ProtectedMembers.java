package OOP2.Inheritance;

public class ProtectedMembers {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "Sammy";
        labrador.display();
        labrador.getInfo();
    }
}

class Animal {
    protected String name;

    protected void display() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {

    public void getInfo() {
        System.out.println("My name is: " + name);
    }
}