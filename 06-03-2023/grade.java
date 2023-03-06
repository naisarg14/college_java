import java.util.Scanner;


public class grade {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int marks;
            do {
                System.out.print("Marks: ");
                marks = input.nextInt();
            } while (marks > 100);
            
            if (marks > 80) {
                System.out.println("Grade: A");
            } else if (marks > 60) {
                System.out.println("Grade: B");
            } else if (marks > 50) {
                System.out.println("Grade: C");
            } else if (marks > 45) {
                System.out.println("Grade: D");
            } else if (marks > 25) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}