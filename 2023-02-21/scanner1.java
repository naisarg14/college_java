import java.util.Scanner;


public class scanner1 {
    public static void main (String[] args) {
        int num;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an Integer Value: ");
            num = input.nextInt();
            System.out.println("You have entered: " + num);
        }
    }
}
