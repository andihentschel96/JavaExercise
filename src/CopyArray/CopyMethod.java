package CopyArray;
import java.util.Arrays;
public class CopyMethod {
    public static void main(String[] args) {
        int[] n1 = {12, 23, 42, 27, 36, 44};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];

        //Copy the whole array into another
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        //Copy a specific index to another specific index
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.print("n3 = " + Arrays.toString(n3));
    }
}