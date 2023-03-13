import java.util.Scanner;
import java.lang.Integer;


public class lowHigh {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = 0, max = 0;
            String number = input.nextLine();
            String[] numbers = number.split(",");
            for (int i = 0; i < 3; i++) {
                //System.out.print("Number " + (i+1) + " : ");
                int num = Integer.parseInt(numbers[i]);
                if (i == 0) {
                    min = num;
                    max = num;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }
            }
            System.out.println(max + " ," + min);
            //System.out.println("The greatest number is " + max + " and the lowest number is " + min + ".");
        }
    }
}