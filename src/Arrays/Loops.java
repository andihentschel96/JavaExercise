package Arrays;

public class Loops {
    public static void main(String[] args) {
        //Creating an array:
        int[] values = new int[10];
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;
        values[4] = 5;
        values[5] = 6;
        values[6] = 7;
        values[7] = 8;
        values[8] = 9;
        values[9] = 10;

        //for-loop
        System.out.println("Using for-loop");
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        //enhanced for-loop (for-each)
        System.out.println("Using foreach-loop");
        for(int a : values)
            System.out.println(a);
    }
}