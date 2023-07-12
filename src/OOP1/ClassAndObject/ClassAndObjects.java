package OOP1.ClassAndObject;

public class ClassAndObjects {
    public static void main(String[] args) {
        Bicycle mountainbike = new Bicycle();
        mountainbike.Braking();
        mountainbike.gear = 8;
    }
}

class Bicycle {
    //State (Field)
    int gear = 5;

    //Behavior (Methods)
    public void Braking() {
        System.out.println("Braking = loosing");
    }
}