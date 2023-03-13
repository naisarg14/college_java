import java.util.Scanner;


public class attendance {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { 
            int held, attended;

            System.out.print("Classes Held: ");
            held = input.nextInt();

            do {
                System.out.print("Classes Attended: ");
                attended = input.nextInt();
            } while (held < attended);

            System.out.println("Attendance: " + attended * 100.0 / held);
            if ((attended * 100.0 / held) >= 75) {
                System.out.println("Allowed TO Sit In The Exam");
            } else {
                System.out.println("Not Allowed TO Sit In The Exam");
            }
        }
    }
}