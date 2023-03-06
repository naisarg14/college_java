import java.util.Scanner;


public class discount {
    public static void main(String[] agrs) {
        try (Scanner input = new Scanner(System.in)) {
            final int cost = 100;

            System.out.println("Quantity: ");

            int qty = input.nextInt();
            int total = qty * cost;

            if (total > 1000) {
                System.out.println("The total cost is : " + total * 0.9);
            } else {
                System.out.println("The total cost is : " + total);
            }

            
        }
    }
}