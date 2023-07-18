package Arrays.MultidimensionalArrays;

public class MultiArray3d {
    public static void main(String[] args) {
        //create a 3d array
        int[][][] array = {
                {
                        {12, 24, 36},
                        {10, 20, 30},
                        {5, 10, 15}
                },
                {
                        {17, 34, 51},
                        {15, 30, 45},
                        {29, 58, 87}
                }
        };
        MultiArray3d.PrintElements(array);
    }
    public static void PrintElements(int[][][] a) {
        for(int[][] array2D: a) {
            for(int[] array: array2D) {
                for(int element: array) {
                    System.out.println(element);
                }
            }
        }
    }
}