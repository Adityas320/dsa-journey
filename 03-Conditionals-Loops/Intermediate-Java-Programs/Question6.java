/*
 * Question 6 - Intermediate Java Programs
 *
 * Calculate Commission Percentage
 */
import java.util.Scanner;
public class Question6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates for the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input coordinates for the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance using Math.hypot()
        double distance = Math.hypot(x2 - x1, y2 - y1);

        // Display the result
        System.out.printf("The distance between the points is: %.4f%n", distance);

        scanner.close();
    }
}
