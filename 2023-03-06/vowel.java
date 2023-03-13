//Write a program to get a char and print if its a vowel or consonant.
import java.util.Scanner;


public class vowel {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Alphabet: ");
            char alpha = input.nextLine().charAt(0);
            if (alpha == 'a' | alpha == 'A' | alpha == 'e' | alpha == 'E' | alpha == 'i' | alpha == 'I' | alpha == 'o' | alpha == 'O' | alpha == 'u' | alpha == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Not A Vowel");
            }
        }
    }
}
