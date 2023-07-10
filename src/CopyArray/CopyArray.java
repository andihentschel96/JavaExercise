package CopyArray;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copy = new int[5];
        CopyArray.CopyArray(array, copy);

        System.out.println("These are the values in copy");
        for(int number: copy) {
            System.out.println(number);
        }
    }
    public static void CopyArray(int[] origin, int[] destination) {
        for(int i = 0; i < origin.length; i++) {
            destination[i] = origin[i];
        }
    }
}