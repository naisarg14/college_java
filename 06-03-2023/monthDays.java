import java.util.Scanner;


public class monthDays {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int month;
            do {
                System.out.print("Month: ");
                month = input.nextInt();
            } while (month < 1 | month > 12);

            System.out.println("The month has " + getDays(month) + " days.");
        }
    }



    public static int getDays (int month) {
        if (month == 2) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Year: ");
                int year = input.nextInt();

                if (isLeapYear(year) == true) {
                    return 29;
                } else {
                    return 28;
                }
            }
        } else {
            int[] days = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return days[month - 1];
        }
    }



    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            }
        }
        return false;
    }
}


