package OOP3.AnonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

class Polygon {     //would also work with an interface
    public void display() {
        System.out.println("Inside Polygon Class");
    }
}

class AnonymousDemo {
    public void createClass() {
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}