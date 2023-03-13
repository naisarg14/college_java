//write a program to take 5 different values from the user and to find its average.
import java.util.Scanner;


public class average {
    
    public static int getAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0, l = numbers.length; i < l; i++) {
            sum += numbers[i];
        }
        return (sum / numbers.length);
    }


    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }
            System.out.println("The average is " + getAverage(numbers));
        }
    }
}