package OOP1.Methods;

public class AllAboutMethods {
    //Declaration of a Method:

    //returnType methodName(parameter1, parameter2,...) {
        //Code goes here
    //}

    //Create a Method

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int square(int i) {
        //return-statement is always required with return types other than void
        return i * i;
    }


    public static void main(String[] args) {
        int added;
        int result;
        // call the method
        // store returned value to a variable (-> result)
        result = square(12);
        added = addNumbers(15, 35);

        System.out.println("The result of adding these numbers is: " + added);
        System.out.println("Squared value of 12 is: " + result);
    }
}