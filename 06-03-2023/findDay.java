import java.util.Scanner;


public class findDay {
    public static String getDay(int day) {
        switch (day) {
            case 1:
                return ("Monday");
            case 2:
                return ("Tuesday");
            case 3:
                return ("Wednesday");
            case 4:
                return ("Thursday");
            case 5:
                return ("Friday");
            case 6:
                return ("Saturday");
            case 7:
                return ("Sunday");
                }
            return "Invalid";
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            int day;
            do {
                System.out.print("Day: ");
                day = input.nextInt();
            } while (day > 7);
            System.out.println(getDay(day));
        }
    }
}