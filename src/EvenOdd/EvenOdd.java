package EvenOdd;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type in any number: ");
        int input = s.nextInt();

        if(input % 2 == 0)
            System.out.println(input + " is even!");
        else
            System.out.println(input + " is odd!");
    }
}