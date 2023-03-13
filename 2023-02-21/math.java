import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        int num1, num2;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number 1: ");
            num1 = input.nextInt();
            System.out.print("Number 2: ");
            num2 = input.nextInt();
        }

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        float divide = (float) num1 / num2;

        System.out.println("Addition Result: " + add);
        System.out.println("Subtraction Result: " + subtract);
        System.out.println("Multiplication Result: " + multiply);
        System.out.println("Division Result: " + divide);
   }
}
