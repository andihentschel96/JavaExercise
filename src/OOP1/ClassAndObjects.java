package OOP1;

public class ClassAndObjects {
    public static void main(String[] args) {
        Bicycle mountainbike = new Bicycle();
        mountainbike.Braking();
    }
}

class Bicycle {
    //State (Field)
    private int gear = 5;

    //Behavior (Methods)
    public void Braking() {
        System.out.println("Braking = loosing");
    }
}