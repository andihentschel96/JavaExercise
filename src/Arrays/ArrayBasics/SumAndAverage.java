package Arrays.ArrayBasics;

public class SumAndAverage {
    public static void main(String[] args) {
        //Variables I need
        int sum = 0;
        double avg;
        //Creating an array
        int[] numbers = new int[5];
        numbers[0] = 8;
        numbers[1] = 16;
        numbers[2] = 36;
        numbers[3] = 12;
        numbers[4] = 15;

        //Looping through the array and adding each value to "sum"
        for(int number : numbers) {
            sum += number;
        }
        //after we get the sum of all elements we can calculate the average value
        avg = (double)sum / (double)numbers.length;

        //Output
        System.out.println("The sum of this array is: " + sum);
        System.out.println("The average value of this array is: " + avg);
    }
}