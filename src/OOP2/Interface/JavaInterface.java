package OOP2.Interface;

//interface Language {
//    public void getType();
//    public void getVersion();
//}

interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of this rectangle is: " + (length * breadth));
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(7, 9);
    }
}
