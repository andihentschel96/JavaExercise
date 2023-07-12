package OOP1.MethodOverloading;

public class Overloading {
    //We create a simple Method that adds 2 numbers and call it AddNumbers()
    public static void AddNumbers(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    //Now we create a second Method called AddNumbers() but with 3 instead of 2 parameters
    public static void AddNumbers(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }
    //In this Method we have 2 parameters like the first Method but a different datatype
    public static void AddNumbers(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        AddNumbers(12, 30);
        AddNumbers(12.5, 29.5);
        AddNumbers(10, 20, 12);
    }
}