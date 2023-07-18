package OOP2.AbstractClassAndMethods;

abstract class Motorbike {
    abstract void brake();
}

class Mountainbike extends Motorbike {
    public void brake() {
        System.out.println("The Mountainbike brakes!");
    }
}
class Sportbike extends Motorbike {
    public void brake() {
        System.out.println("The Sportsbike brakes!");
    }
}
 class Main {
    public static void main(String[] args) {
        Mountainbike b1 = new Mountainbike();
        Sportbike s1 = new Sportbike();
        b1.brake();
        s1.brake();
    }
 }