package Arrays.MultidimensionalArrays;

public class MultiArray2d {
    public static void main(String[] args) {
        int[][] multidimensional = {
                {12, 18, 27, 19, 14},   //Row 1
                {22, 37, 29, 23, 42},   //Row 2
                {17, 89, 96, 51, 40}    //Row 3
        };
        MultiArray2d.PrintAllForLoop(multidimensional);
        MultiArray2d.PrintAllEnhancedFor(multidimensional);
    }

    public static void PrintAllForLoop(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
    public static void PrintAllEnhancedFor(int[][] a) {
        for(int[] inner: a) {
            for(int values: inner) {
                System.out.println(values);
            }
        }
    }
}