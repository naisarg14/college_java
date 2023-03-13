//Write a program to check if the given character is lowercase or uppercase
import java.util.Scanner;


public class checkCase {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char x = input.nextLine().charAt(0);
            if (65 <= x & x <= 90) {
                System.out.println("UpperCase");
            } else if (97 <= x & x <= 122) {
                System.out.println("LowerCase");
            } else {
                System.out.println("Not An Alphabet");
            }
        }
    }
}