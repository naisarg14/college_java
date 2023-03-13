import java.util.Scanner;


public class square {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Length : ");
            int length = input.nextInt();
            System.out.print("Breath : ");
            int breath = input.nextInt();

            if (length == breath) {
                System.out.println("It is a square of side " + length + ".");
            } else {
                System.out.println("It is not a square.");
            }
        }
    }
}