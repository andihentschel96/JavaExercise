package OOP2.SuperKeyword;

public class AccessAttribute {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.printType();
    }
}

class Animal2 {
    protected String type = "Animal";
}

class Dog2 extends Animal2 {
    public String type = "Mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}