package OOP3.JavaReflection;
import java.lang.Class;
import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Class b = d1.getClass();
    }
}
class Animal {
    public void display() {

    }
}
class Dog extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }
}