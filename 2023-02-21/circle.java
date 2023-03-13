import java.util.Scanner;


public class circle {

    public static double area (double r) {
        return 3.14 * r * r;
    }
    
    public static void main (String[] args) {
        double radius;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Radius: ");
            radius = input.nextDouble();
            System.out.println("The area of the circle with radius " + radius + " is " + area(radius));
        }
    }
}
