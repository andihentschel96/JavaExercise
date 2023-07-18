package Basics.SwapTwoNumbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //Using a temporary variable
        //Variables
        int number1 = 12;
        int number2 = 24;
        //Output before swap
        System.out.println("--Output the numbers before the swap.");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
        //Swap
        int temp = number1;
        number1 = number2;
        number2 = temp;
        //Output after swap
        System.out.println("--Output the numbers after the swap.");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        //Without a temporary variable
        //Variables
        float first = 10.0f;
        float second = 20.0f;
        //Output before swap
        System.out.println("Output the numbers before the swap");
        System.out.println("First float: " + first);
        System.out.println("Second float " + second);
        //Swap
        first = first - second;
        second = first + second;
        first = second - first;
        //Output after swap
        System.out.println("Output the numbers after the swap");
        System.out.println("First float: " + first);
        System.out.println("Second float " + second);
    }
}