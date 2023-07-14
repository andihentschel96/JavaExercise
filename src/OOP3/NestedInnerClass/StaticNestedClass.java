package OOP3.NestedInnerClass;
//
////This file actually provides an error:
////'OOP3.NestedInnerClass.Motherboard.this' cannot be referenced from a static context
////This is because we are not using the object of the outer class to create an object of the inner class.
////Hence, there is no reference to the outer class Motherboard stored in Motherboard.this.
//public class StaticNestedClass {
//    public static void main(String[] args) {
//        //Create an object of the static nested class
//        //using the name of the outer class
//        Motherboard.USB usb = new Motherboard.USB();
//        System.out.println("Total Ports: " + usb.getTotalPorts());
//    }
//}
//
//class Motherboard {
//    String model;
//    public Motherboard(String model) {
//        this.model = model;
//    }
//    static class USB {
//        int usb3 = 3;
//        int usbc = 2;
//
//        int getTotalPorts() {
//            //accessing the variable model of the outer class
//            if (Motherboard.this.model.equals("MSI")) {
//                return 7;
//            } else {
//                return usb3 + usbc;
//            }
//
//        }
//    }
//}