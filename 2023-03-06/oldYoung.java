//Write a java program to take the age of 5 individuals and to find the eldest and youngest.
import java.util.Scanner;


public class oldYoung {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = 0, max = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Age of Person " + (i + 1) + " : ");
                int age = input.nextInt();
                if (i == 0) {
                    max = age;
                    min = age;
                }
                if (max < age) {
                    max = age;
                }
                if (min > age) {
                    min = age;
                }
            }

            System.out.println("The Oldest is of age " + max + " and the Youngest is of age " + min + ".");
        }
    }
}