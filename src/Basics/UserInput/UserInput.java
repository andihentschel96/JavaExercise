package Basics.UserInput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //creating a new Scanner instance
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        //Input gets saved in a variable
        int number = reader.nextInt();

        //Output of the Basics.UserInput
        System.out.println("Your number is: " + number);
    }
}