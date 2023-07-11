package CopyArray;
import java.util.Arrays;
public class CopyRange {
    public static void main(String[] args) {
        int[] source = {2, 4, 7, 13, 26};

        //copy of the entire source array
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        //copy specific indices
        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));
    }
}