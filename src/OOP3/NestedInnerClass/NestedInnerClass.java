package OOP3.NestedInnerClass;

public class NestedInnerClass {
    public static void main(String[] args) {
        System.out.println("Example 1: \n");
        //Create an object of outer class CPU
        CPU cpu = new CPU();

        //Create an object of inner class
        CPU.Processor processor = cpu.new Processor();

        //Create an object of protected inner class
        //using the outer class
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache: " + processor.getCache());
        System.out.println("RAM Clock Speed: " + ram.getClockSpeed());

        //formatting the output for readability
        System.out.println("\n");
        System.out.println("Example 2: \n");

        //Creating an object of the outer class Car
        Car c1 = new Car("Audi", "8WD");
        // create an object of inner class using the outer class
        Car.Engine e1 = c1.new Engine();
        //Calling setEngine();
        e1.setEngine();
        System.out.println("Engine Type of 8WD: " + e1.getEngineType());

        Car c2 = new Car("Crysler", "4WD");
        Car.Engine e2 = c2.new Engine();
        e2.setEngine();
        System.out.println("Engine Type of 4WD: " + e2.getEngineType());
    }
}

//Creating the outer class first
class CPU {
    //Fields of the outer class
    double price;

    //Creating the first inner class
    class Processor {
        //Fields of first inner class
        double cores;
        String manufacturer;
        //Method of the first inner class
        double getCache() {
            return 4.3;
        }
    }

    //second inner class is protected
    protected class RAM {
        //Fields of protected inner class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

//outer class Car
class Car {
    //Fields of Car
    String carName;
    String carType;

    //Constructor
    Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    //private method outer class
    private String getCarName() {
        return this.carName;
    }

    //inner class
    class Engine {
        String engineType;
        void setEngine() {
            //accessing the carTyp property of Car
            if(Car.this.carType.equals("4WD")) {
                //invoke method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            } else {
                this.engineType = "Bigger";
            }
        }
        String getEngineType() {
            return this.engineType;
        }
    }
}