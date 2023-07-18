package OOP1.ClassAndObject;

public class Lamp {
    //Fields
    boolean isOn;

    //methods
    void turnOn() {
        isOn = true;
        System.out.println("Does it work? " + isOn);
    }
    void turnOff() {
        isOn = false;
        System.out.println("Does it work? " + isOn);
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp flashlight = new Lamp();

        led.turnOn();
        flashlight.turnOn();

        led.turnOff();
        flashlight.turnOff();
    }
}