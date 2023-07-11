package OOP1.Methods;

public class AllAboutMethods {
    //Declaration of a Method:

    //returnType methodName(parameter1, parameter2,...) {
        //Code goes here
    //}

    //Create a Method
    public static int square(int i) {
        //return-statement is always required with return types other than void
        return i * i;
    }


    public static void main(String[] args) {
        int result;
        double result2;
        // call the method
        // store returned value to a variable (-> result)
        result = square(12);

        System.out.println("Squared value of 12 is " + result);
    }
}